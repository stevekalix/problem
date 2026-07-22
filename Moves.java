public class Moves {
    public static void main(String[] args) {

        int arr[] = new int[] { 1, 0, 2, 45, 0, 2, 0, 5, 0 };

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;

            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
