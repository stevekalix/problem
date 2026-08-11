/**
 * Avg
 */
public class Avg {

    public static void main(String[] args) {

        int arr[] = new int[] { 10, 20, 30 };

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        int avg = 0;

        while (sum >= arr.length) {

            sum -= arr.length;
            avg++;

        }
        System.out.println(avg);
    }
}