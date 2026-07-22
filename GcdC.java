
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class GcdC {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        for (int i = 0; i < n; i++) {
            a = gcd(a, arr[i]);
        }
        System.out.print(a);

    }
}