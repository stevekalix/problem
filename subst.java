import java.util.HashSet;
import java.util.Set;

public class subst {

    public static void main(String[] args) {

        String st = "abcdeabcddefgl"; // 4

        int left = 0;
        int max = 0;
        Set<Character> s = new HashSet<>();
        String substring = "";
        for (int i = 0; i < st.length(); i++) {

            while (s.contains(st.charAt(i))) {
                s.remove(st.charAt(left));
                left++;
            }
            s.add(st.charAt(i));

            // max = Math.max(max, i - left + 1);
            if (i - left + 1 > max) {
                max = i - left + 1;
                substring = st.substring(left, i + 1);
            }
        }

        System.out.println(max + "  " + substring);
    }
}
