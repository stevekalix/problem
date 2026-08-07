import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RepeatedAndMissing {
    public static void main(String[] args) {

        int arr[] = new int[] { 1, 1, 2, 3, 4, 5 };
        int n = arr.length;
        HashMap<Integer, Integer> mp = new LinkedHashMap<>();
        for (int num : arr) {
            if (mp.containsKey(num)) {
                mp.put(num, mp.get(num) + 1);
            } else {
                mp.put(num, 1);
            }
        }

        int repeat = 0;
        int missing = 0;

        for (int i = 1; i <= n; i++) {
            if (!mp.containsKey(i)) {
                missing = i;
            }

            if (mp.getOrDefault(i, 0) > 1) {
                repeat = i;
            }
        }

        System.out.println(repeat + " " + missing);
    }

}
