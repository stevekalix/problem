import java.util.Scanner;

class Reverse {
    /**
     * @param a
     */
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch[] = st.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        StringBuilder str = new StringBuilder();
        for (char c : ch) {
            str.append(c);
            str.append(" ");
        }
        System.out.println(str.toString());
    }
}