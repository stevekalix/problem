package Folders.String;

public class Abbrivation {

    public static String str = "karpagam Institute of Techonology";
    public static void main(String[] args) {

        String s[] = str.split(" ");

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > 3) {

                char ch = s[i].charAt(0);
                if (ch > 'a' && ch < 'z') {
                    ch = (char) (ch - 32);
                }
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }

}
