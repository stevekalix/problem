class Strin {

    public static void main(string a[]) {

        String s = "Manikandan";

        StringBuilder str = new StringBuilder(s);

        String re = str.reverse().toString();

        if (s.equals(re)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}