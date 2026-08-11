import java.util.*;

public class Threesum {

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 3, 2, 4, 5 };
        int t = 9;
        int n = arr.length;

        ArrayList<Integer> ls = new ArrayList<>();
        boolean flag = false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {

            int left = 1 + i;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == t) {
                    ls.add(arr[i]);
                    ls.add(arr[left]);
                    ls.add(arr[right]);
                    left++;
                    right--;
                    flag = true;
                    break;
                }
                if (sum < t) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (!flag) {
            System.out.println("Not Found in the array");
        } else {
            System.out.println(ls);
        }

        // System.out.println(ls);

    }
}
