package Mine;

public class LeetCode01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        
        for (int i = 0; i < length ; i ++){
            for (int j = i+1 ; j < length ; j ++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}