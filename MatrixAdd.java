public class MatrixAdd {
    public static void main(String[] args) {

        int mat[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = 3;

        int row[] = new int[n];
        int col[] = new int[n];
        for (int i = 0; i < n; i++) {
            int r = 0;
            int c = 0;
            for (int j = 0; j < n; j++) {
                r += mat[i][j];
                c += mat[j][i];

            }
            row[i] = r;
            col[i] = c;
        }

        int total = 0;
        for (int value : row) {
            total += value;
        }
        int ans[][] = new int[n + 1][n + 1];

        int p_r = 0;
        int c_r = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < row.length; i++) {
            ans[i][n] = row[i];
        }

        for (int i = 0; i < col.length; i++) {
            ans[n][i] = col[i];
        }
        ans[ans.length - 1][ans.length - 1] = total;

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
