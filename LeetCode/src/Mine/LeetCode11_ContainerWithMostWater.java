package Mine;
/*
 * 
 * 
 Given n non-negative integers a1, a2, ..., an, 
 where each represents a point at coordinate (i, ai). n vertical lines 
 are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 Find two lines, which together with x-axis forms a container, 
 such that the container contains the most water.

Note: You may not slant the container.

Subscribe to see which companies asked this question
 
 
 
 * 
 * 
 */
public class LeetCode11_ContainerWithMostWater {
	
    public static int maxArea(int[] height) {
        
    	if (height == null|| height.length == 0) return 0;
    	int max = 0;
    	int len = height.length;
    	int i = 0;
    	int j = len -1;
    	while(i <= j) {
    	    int water = (j - i)*Math.min(height[i], height[j]);
    	    if (water > max) max = water;
    		if (height[i] <= height[j])
    			i ++;
    		else
    			j --;
    	}
    	
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,1};
		System.out.println(LeetCode11_ContainerWithMostWater.maxArea(height));
	}

}
