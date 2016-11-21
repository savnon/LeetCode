package Mine;
/*
 * Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

Subscribe to see which companies asked this question
 */
public class LeetCode09_PalindromeNumber {
	
    public static  boolean isPalindrome(int x) {
        
    	if (x < 0) return false;
    	String str = Integer.toString(x);
    	int i = 0;
    	int j = str.length() -1;
    	while(i <= j) {
    		if(str.charAt(i) == str.charAt(j)) {
    			i ++; 
    			j --;
    		} else {
    			return false;
    		}
    	}
    	
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LeetCode09_PalindromeNumber.isPalindrome(11));
	}

}
