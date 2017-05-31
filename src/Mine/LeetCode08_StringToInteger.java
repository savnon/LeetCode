package Mine;

public class LeetCode08_StringToInteger {

    public static int myAtoi(String str) {
        
    	  if(str == null || "".equals(str.trim())) return 0;
    	    str = str.trim();
    	    if(str.matches("[+-]{0,1}\\d+")){
    	        return new Double(str).intValue();
    	    }
    	    //use double because double is larger than int and long
    	    double sum = 0;
    	    //count the '+'
    	    int addCount = 0;
    	    //count the '-';
    	    int  subCount = 0;
    	    char[] numbers = str.toCharArray();
    	    for(char num : numbers){
    	        if('+' == num){
    	            addCount++;
    	        }else if('-' == num){
    	            subCount++;
    	        }
    	        //it means that it is not a digit because A-Z[65-90] a-z[97,122] and 0-9[48-58]
    	        else if(num - '0' > 9){
    	            break;
    	        }
    	        else if(' ' == num){
    	            break;
    	        }else{
    	            sum *= 10;
    	            sum += num - '0';
    	        }
    	        //it is not a correct format 
    	        if((addCount + subCount) >= 2){
    	            return 0;
    	        }
    	    }
    	    if(sum > Integer.MAX_VALUE){
    	        if(subCount == 0){
    	            return Integer.MAX_VALUE;
    	        }
    	        return Integer.MIN_VALUE;
    	    }else{
    	         if(subCount == 0){
    	             return (int)sum;
    	         }
    	         return (int)sum * -1;
    	    }
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LeetCode08_StringToInteger.myAtoi("010"));
	}

}
