public class VowelsCons {
    public static void main(String[] args) {
        String str = "Programming";
        int vowel = 0;
        int con = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowel++;
            } else {
                con++;
            }
        }

        System.out.println(vowel + "   " + con);
    }
}
