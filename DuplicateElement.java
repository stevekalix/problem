
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        String st = "banana";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < st.length(); i++) {
            set.add(st.charAt(i));
        }
        System.out.print(set);
    }
}
