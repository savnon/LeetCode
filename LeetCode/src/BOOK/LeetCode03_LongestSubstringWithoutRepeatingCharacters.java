package BOOK;

import java.util.HashSet;
import java.util.Set;

public class LeetCode03_LongestSubstringWithoutRepeatingCharacters {
	 public int lengthOfLongestSubstring(String s) {
	        Set<Character> set = new HashSet<Character>();
	        int n = s.length(),i = 0, j = 0, ans=0;
	        
	        while(i<n &&j<n) {
	            if(!set.contains(s.charAt(j))){
	                set.add(s.charAt(j));
	                j ++;
	                ans = Math.max(ans,j-i);
	            } else {
	                set.remove(s.charAt(i));
	                i ++;
	            }
	        }
	        return ans;
	    }
}
