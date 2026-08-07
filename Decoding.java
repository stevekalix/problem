public class Decoding {

    public static void main(String[] args) {

        String str = "aabbbcccoooooopsddddddddddddddddddd";
        StringBuilder st = new StringBuilder();
        int count = 1;
        char ch[] = str.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                st.append(ch[i - 1]);
                st.append(count);

                count = 1; // there we will must reset the count
            }
        }
        st.append(ch[ch.length - 1]);
        st.append(count);
        System.out.println(st.toString());
    }

}
