import java.util.*;

public class Exceptitself {
    public static void main(String[] args) {

        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int n = a.length;
        int pre[] = new int[n];
        pre[0] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * a[i - 1];
        }

        int r = 1;

        for (int j = n - 1; j >= 0; j--) {
            pre[j] *= r;
            r *= a[j];
        }

        for (int val : pre) {
            System.out.print(val + " ");
        }

    }

}
