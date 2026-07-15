import java.util.Scanner;

/**
 * Binary
 */
public class Binary {
    public static void search(int a[], int k) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == k) {
                System.out.println("Element is found!!!!! " + mid + " index possition ");
                return;
            }

            else if (a[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        System.out.println("Element not found");

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array : ");
            int n = sc.nextInt();
            System.out.println("Enter the Element array : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the search Element : ");
            int search = sc.nextInt();

            search(arr, search);
        }
    }

}