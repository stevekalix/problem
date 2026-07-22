public class MaximumSubSumK {
    public static void main(String[] args) {

        int arr[] = new int[] { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int max = 0;
        int windowsize = 0;

        for (int i = 0; i < k; i++) {
            windowsize += arr[i];
        }
        max = windowsize;

        for (int j = k; j < arr.length; j++) {

            // windowsize = windowsize - arr[j - k] + arr[j];

            max = Math.max(max, windowsize - arr[j - k] + arr[j]);
        }
        System.out.println(max);
    }
}
