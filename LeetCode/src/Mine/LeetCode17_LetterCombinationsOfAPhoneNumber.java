package Mine;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by wangpeng on 16/11/21.
 */
public class LeetCode17_LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz" };
        ans.add("");
        for(int i = 0; i < digits.length(); i ++) {
            int x = Character.getNumericValue(digits.charAt(i));
            System.out.println(x);
            while (ans.peek().length() == i) {
                String t = ans.remove();
                System.out.println("i is :" +i);
                for (char s : mapping[x].toCharArray()) {
                    ans.add(t + s);
                    System.out.println("t + s :" + t + s);
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LeetCode17_LetterCombinationsOfAPhoneNumber.letterCombinations("34");
    }

}


