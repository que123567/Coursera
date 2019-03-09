package partI;

/**
 * 加权QN,让小树并入大树,使得树的高度不至于过高
 */
public class WeightedQuickUnion {

    public int[] Id;
    //
    public int[] sz;

    public WeightedQuickUnion(int n) {
        Id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            Id[i] = i;
            sz[i] = 1;
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
        if (sz[i] < sz[j]) {
            Id[i] = j;
            sz[j] += sz[i];
        } else {
            Id[j] = i;
            sz[i] += sz[j];
        }
    }
}
