import java.util.HashSet;
import java.util.Set;

public class TwoMissing {

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 4, 6, 8 };
        Set<Integer> st = new HashSet<>();
        for (int number : arr) {
            st.add(number);
        }

        for (int i = 1; i <= arr.length + 2; i++) {

            if (!st.contains(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
