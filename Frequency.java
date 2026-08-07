import java.util.*;
import java.util.Map;

class Frequency {

    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 1, 1, 1, 2, 2, 3, 4, 5, 6, 4, 4 };

        Map<Integer, Integer> mp = new LinkedHashMap<>();
        for (int num : a) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        System.out.println(mp);
    }

}