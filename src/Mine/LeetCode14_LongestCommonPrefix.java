package Mine;

public class LeetCode14_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
     
    	if(strs == null) {
    		return null;
    	}
    	
    	if(strs.length == 0) {
    		return "";
    	}
    	int len = strs.length;
    	int min = Integer.MAX_VALUE;
    	StringBuilder sb = new StringBuilder();
    	
    	for (String str : strs) {
    		if (str.length() < min) {
    			min = str.length();
    		}
    	}
    	System.out.println(min);
    	for (int i = 0; i < min; i ++) {
    		Boolean flag = true;
    		char current = strs[0].charAt(i);
    		for(int j = 0; j < len; j ++) {
    			if (strs[j].charAt(i) == current) {
    				continue;
    			} else {
    				flag = false;
    				break;
    			}
    			
    				
    		}
    		if(flag) {
    			sb.append(current);
    		} else {
    			break;
    		}
    		
    	}
    	
    	return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {
				"aaccdf",
				"aacccc",
				"aacc"
		};
		System.out.println(LeetCode14_LongestCommonPrefix.longestCommonPrefix(test));
	}

}
