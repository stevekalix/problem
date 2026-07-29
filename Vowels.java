import java.util.*;
import java.util.List;

class Vowels {

    public static void main(String arr[]) {

        String str = "Mani455najn332rnda9m3rj1akdas";

        String a[] = str.split("[^0-9]+");
        for (String v : a) {
            if (!v.isEmpty()) {
                System.out.print((Integer.parseInt(v) + 1) + " ");
            }
        }

        // List<Integer> ls = new ArrayList<>();
        // for (int i = 0; i < str.length(); i++) {
        // if (Character.isDigit(str.charAt(i))) {
        // ls.add(str.charAt(i) - '0');
        // }
        // }
        // System.out.println(ls);
    }
}