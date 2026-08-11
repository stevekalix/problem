import java.util.*;

public class Subarraysum {

    static List<List<Integer>> list = new ArrayList<>();

    static void backtrack(int arr[], int index, int target, List ls) {

        if (target == 0) {
            list.add(new ArrayList<>(ls));
            return;
        }

        ls.add(arr[index]);
        backtrack(arr, index + 1, target - arr[index], ls);
        ls.remove(ls.size() - 1);
        backtrack(arr, index + 1, target, ls);
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3 };
        int target = 3;
        backtrack(arr, 0, target, new ArrayList<>());
        System.out.println(list);

    }

}
