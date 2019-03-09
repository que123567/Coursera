package partI;

/**
 * 根据是否有相同的父类判断连通性(数组值为其父类)
 */
public class QuickUnionUF {
    public int[] Id;

    public QuickUnionUF(int n) {
        Id = new int[n];
        for (int i = 0; i < n; i++) {
            Id[i] = i;  //set id of each object to itself
        }
    }

    private int root(int i) {
        while (i != Id[i]) {
            i = Id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        Id[j] = i;
    }
}
