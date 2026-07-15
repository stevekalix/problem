import java.util.*;

class List {

    public static void main(String a[]) {

        ArrayList<Integer> ls = new ArrayList<>();
        int index = 1;
        while (index < 5) {
            ls.add(index);
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < ls.size(); i++) {

            ArrayList<Integer> in = new ArrayList<>();
            for (int j = i; j < ls.size(); j++) {
                in.add(ls.get(i));
            }

            if (!list.contains(ls)) {
                list.add(ls);
            }
        }

        System.out.println(list);
    }
}