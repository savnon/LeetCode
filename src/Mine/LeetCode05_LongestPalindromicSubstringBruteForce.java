package Mine;


public class LeetCode05_LongestPalindromicSubstringBruteForce {

	public static String LongestPalindromicSubstring(String s) {
		int n = s.length();
		int max = 0, startPoint = 0;
		
		for(int i = 0 ; i <= n; i ++) {
			for (int j = i + 1; j <= n; j ++) {
				if(isPalindromic(s.substring(i,j))) {
					if(max < j-i) {
						max = j - i;
						startPoint = i;
					}
				}
			}
		}
		
		
		return s.substring(startPoint,startPoint + max);
	}
	
	public static boolean isPalindromic (String s) {
		
		int n = s.length();
		int i = 0;
		while(i<n/2) {
			if (s.charAt(i) == s.charAt(n-i -1)) {
				i ++;
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			String test1 = "abba";
//			String test2 = "a";
//			System.out.println(isPalindromic(test1));
//			System.out.println(isPalindromic(test2));
//			String test = "a";
//			System.out.println(test.substring(0,1));
			System.out.println(LongestPalindromicSubstring("babab"));
	}

}
