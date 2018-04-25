public class LeetCode100_SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p !=null && q == null) || (p == null && q != null)) return false;
        if(sameNode(p,q)){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        } else {
            return false;
        }

    }

    public boolean sameNode(TreeNode p, TreeNode q) {
        return p.val == q.val;
    }


}
