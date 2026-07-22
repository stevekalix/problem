import java.util.Scanner;

class Gcd {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a / gcd(a, b) * b);
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = sc.nextInt();

        // while (n-- > 0) {

        // int b = sc.nextInt();

        // while (b != 0) {
        // int te = b;
        // b = a % b;
        // a = te;
        // }
        // }
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

        System.out.println(lcm(a, b));

        System.out.println(gcd(a, b) * lcm(a, b));

    }
}