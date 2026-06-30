public class Short {
    public static void main(String[] args) {

        String st = new String("9 4 2 5 6 8 1 10");
        String[] ar = st.split(" ");
        int arr[] = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            arr[i] = Integer.parseInt(ar[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
