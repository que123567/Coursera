package partII.SubString;

public class BruteForce {
    public static void main(String[] args) {

    }

    /**
     * i points to end of sequence of already-matched chars in text.
     * j stores # of already-matched chars (end of sequence in pattern).
     *
     * @param pat
     * @param txt
     * @return
     */
    public static int search(String pat, String txt) {
        int i, N = txt.length();
        int j, M = pat.length();
        for (i = 0, j = 0; i < N && j < M; i++) {
            if (txt.charAt(i) == pat.charAt(j)) {
                j++;
            } else {
                i -= j;
                j = 0;
            }
        }
        if (j == M) {
            return i - j;
        } else {
            return N;
        }
    }
}
