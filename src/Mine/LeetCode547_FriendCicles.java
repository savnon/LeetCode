public class LeetCode547_FriendCicles {

    class UnionFind {
        private int[] parent;
        private int[] rank;
        private int count;

        public UnionFind(int n){
            count = n;
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i ++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int p) {
            while(p !=parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if(rootP == rootQ)  return;

            if(rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
            else if(rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            count --;
        }

        public int count() {
            return count;
        }

    }

    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
        }
        return uf.count();
    }
}
