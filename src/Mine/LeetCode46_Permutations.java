import java.util.ArrayList;
import java.util.List;

public class LeetCode46_Permutations {
    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static int[] path = new int[100];

    public static boolean[] v = new boolean[100];

    public static void robot(int idx, int[] nums) {
        if(idx >= nums.length) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0 ; i < nums.length; i ++) {
                tmp.add(nums[path[i]]);
            }
            ans.add(tmp);
            return;
        }
        for (int i = 0 ; i < nums.length; i ++) {
            if(v[i] == false){
                path[idx] = i;
                v[i] = true;
                robot(idx + 1, nums);
                v[i] = false;
            }

        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        ans.clear();
        robot(0, nums);
        return ans;
    }

    public static void main(String args[]) {
        int[] num = {1,2,3};
        LeetCode46_Permutations.permute(num);
    }
}
