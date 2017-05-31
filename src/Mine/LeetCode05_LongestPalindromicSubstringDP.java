package Mine;


public class LeetCode05_LongestPalindromicSubstringDP {

	public static String LongestPalindromicSubstring(String s) {
		
		if(s == null || s.length() <= 1)
			return s;
		
		int len = s.length();
		int maxLen = 1;
		boolean [][] dp = new boolean [len][len];
		String longest = null;
		
		for (int l = 0; l < s.length() ; l ++){
			for(int i = 0; i < len - l; i ++){
				
				int j = i + l;
				if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
					dp[i][j] = true;
				    
					if(j - i + 1 > maxLen) {
						maxLen = j-i+1;
						longest = s.substring(i, j + 1);
//						System.out.println("i  is : " + i + "   j is : "+ j);
					}
				}
			    System.out.println("i is"+ i + " "+ "j is " + j + " " + " L is : " + l + " " );
			}
			System.out.println();
		}
		
		for (int i = 0; i < len ; i ++){
			for (int j = 0; j < len; j ++) {
				if (dp[i][j] == true)
					System.out.print(1+ " ");
				else
					System.out.print(0+ " ");
		
			}
			System.out.println();
		}
		
		return longest;

	}
	
	public static String longestPalindrome(String s) {
	    if(s==null || s.length()<=1)
	        return s;
	 
	    int len = s.length();
	    int maxLen = 1;
	    boolean [][] dp = new boolean[len][len];
	 
	    String longest = null;
	    for(int l=0; l<s.length(); l++){
	        for(int i=0; i<len-l; i++){
	            int j = i+l;
	            if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
	                dp[i][j]=true;
	 
	                if(j-i+1>maxLen){
	                   maxLen = j-i+1; 
	                   longest = s.substring(i, j+1);
	                }
	            }
	        }
	    }
	 
	    return longest;
	}
		
	public static void main(String[] args) {

			System.out.println(LongestPalindromicSubstring("bababc"));
	}

}
