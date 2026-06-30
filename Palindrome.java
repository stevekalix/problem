class Palindrome {
    public static void main(String[] args) {
        String st = "madam";
        StringBuilder str_1 = new StringBuilder();
        str_1.append(st);

        StringBuilder str_2 = new StringBuilder();
        str_2.append(str_1);
        str_2 = str_2.reverse();

        System.out.println(str_1);
        System.out.println(str_2);

        if (str_1==str_2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}