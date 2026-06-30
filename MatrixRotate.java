public class MatrixRotate {

    public static void main(String[] args) {

        int arr[][] = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp_1 = arr[i][left]; // swap the element here
                arr[i][left] = arr[i][right];
                arr[i][right] = temp_1;

                left++; // increment here left index
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
