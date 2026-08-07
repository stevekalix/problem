import java.util.*;

class Map {
    public static void main(string a[]) {

        String st = "My name is manikandana and i am name name is manikandan in karpagam institutte of techonology";

        HashMap<String, Integer> mp = new LinkedHashMap<>();
        String str[] = st.split(" ");
        for (String s : str) {
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
            } else {
                mp.put(s, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(
                mp.entrySet());

        Collections.sort(list,
                (a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0).getKey());
        }

    }

    public class Entry<T1, T2> {
    }
}