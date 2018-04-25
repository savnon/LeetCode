import java.util.ArrayList;
import java.util.List;

public class LeetCode77_Combinations {

    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static int[] path = new int[100];

    public static int K = 0;

    public void robot(int idx, int n, int k) {
        if(k == 0) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0 ; i < K; i ++) {
                tmp.add(path[i]);
            }
            ans.add(tmp);
            return ;
        }

        for(int i = idx + 1; i <= n ; i ++) {
            path[k - 1] = i;
            robot(i, n , k - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        K = k;
        robot(0,n,k);
        return ans;
    }
}
