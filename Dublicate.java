import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dublicate {

    public static void main(String[] args) {
        String str = "Programming";
        List<Character> ls = new ArrayList<>();
        Set<Character> st = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (st.contains(str.charAt(i))) {
                ls.add(str.charAt(i));
            } else {
                st.add(str.charAt(i));
            }
        }

        System.out.println(st);
        System.out.println(ls);
    }
}
