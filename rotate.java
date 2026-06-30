import java.lang.Thread.State;

class rotate {

    static void reverse(int f, int l, int a[]) {

        while (f < l) {
            int temp = a[f];
            a[f] = a[l];
            a[l] = temp;
            f++;
            l--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        int rotate = 3;
        rotate = rotate % arr.length;

        reverse(0, rotate-1, arr);
        reverse(rotate, arr.length - 1, arr);
        reverse(0, arr.length - 1, arr);

        System.out.print("[");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("]");

    }
}