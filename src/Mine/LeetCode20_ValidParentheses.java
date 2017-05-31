package Mine;

import java.util.Stack;

/**
 * Created by pewwang on 2016/11/24.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 Subscribe to see which companies asked this question
 */
public class LeetCode20_ValidParentheses {
    public boolean isValid(String s) {
        if (s == null)  return  false;
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i ++) {
            if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }  else {
                if(!st.isEmpty()){
                    char tmp = st.pop();
                    if(s.charAt(i) == ')') {
                        if(tmp != '(') return  false;
                    }
                    if(s.charAt(i) == ']') {
                        if(tmp != '[') return  false;
                    }
                    if(s.charAt(i) == '}') {
                        if (tmp != '{') return false;
                    }
                }else {
                    return false;
                }
            }
        }

        return  st.isEmpty();
    }
}
