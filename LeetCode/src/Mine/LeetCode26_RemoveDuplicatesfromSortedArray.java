package Mine;

/**
 * Created by pewwang on 2016/11/28.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

 Subscribe to see which companies asked this question
 */
public class LeetCode26_RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;

        int current = 0;


        for (int i =0;i < nums.length - 1; i ++) {
            if(nums[i] == nums[i + 1]) {

            } else {
                nums[current + 1] = nums[i + 1];
                current ++;
            }
        }
        for(int i = 0; i < nums.length; i ++) {
            System.out.println(nums[i]);
        }
        System.out.println(current + 1);
        return current + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,4,5,5,5,5,7};
        LeetCode26_RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
    }
}
