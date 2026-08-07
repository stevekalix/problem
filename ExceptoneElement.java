class ExceptoneElement {

    public static void main(String[] args) {
        String st = "abcdef";
        String sp = "abcef";

        int ch[] = new int[26];

        for (char ct : st.toCharArray()) {
            ch[ct - 'a']++;
        }

        for (char cp : sp.toCharArray()) {
            ch[cp - 'a']--;
        }

        for (int ans : ch) {
            System.out.print(ans + " ");
        }
    }
}