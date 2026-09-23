package Folders.Permutation;

import java.util.ArrayList;
import java.util.Collections;

class ProductLessK {

    public static ArrayList<Long> list = new ArrayList<>();

    public static void per(int arr[], ArrayList<Integer> ls) {

        // permutation size = 5
        if (ls.size() == 5) {
           if(!ls.isEmpty()){
            String str ="";

            for(int num : ls){
                str+= num;
            }
            list.add(Long.parseLong(str));
           }
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (ls.contains(arr[i])) {
                continue;
            }

            ls.add(arr[i]);

            per(arr, ls);

            ls.remove(ls.size() - 1);
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        per(arr, new ArrayList<>());

        System.out.println(Collections.max(list));
    }
}