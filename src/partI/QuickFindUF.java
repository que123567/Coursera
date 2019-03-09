package partI;

/**
 * QuickFindUF
 * 根据数组值是否相同判断连通性
 */
public class QuickFindUF {
    private int Id[];

    public QuickFindUF(int n) {
        Id = new int[n];
        for (int i = 0; i < n; i++) {
            Id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return Id[p] == Id[q];
    }

    public void Union(int p, int q) {
        int pid = Id[p];
        int qid = Id[q];
        for (int i = 0; i < Id.length; i++) {
            if (Id[i] == pid) {
                Id[i] = qid;
            }
        }
    }
}
