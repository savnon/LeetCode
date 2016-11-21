package Mine;

public class LeetCode07_ReverseInteger_not_finished {

	
    public static int reverse(int x) {
        if (x == 0) return x;
        
        String str = Integer.toString(Math.abs(x));
        String result = null;
        if (x > 0) result = new StringBuilder(str).reverse().toString();
        else result = "-" + new StringBuilder(str).reverse().toString();
        Long resultLong = Long.parseLong(result);
        if (resultLong > Integer.MAX_VALUE ||resultLong < Integer.MIN_VALUE) return 0;
        return Integer.parseInt(resultLong.toString());
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverse(512365478));
	}

}
