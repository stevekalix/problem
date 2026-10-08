package Folders.SubArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * MaximumNegativeSubArraySum
 */
public class MaximumNegativeSubArraySum {

    public static void main(String[] args) {
        
        int a[] ={1, 2, 3, -1, 6};

        ArrayList<ArrayList<Integer>> o_l = new ArrayList<>();
         ArrayList<Integer> i_l = new ArrayList<>();

        for(int n : a){
            if(n>=0){
                i_l.add(n);
            }
            else if(!i_l.isEmpty()){
                o_l.add(new ArrayList<>(i_l));
                i_l.clear();
            }
        }

        if(o_l.isEmpty()){
            System.out.println(-1);
        }

        if(!i_l.isEmpty()){
            o_l.add(new ArrayList<>(i_l));
        }

        Map<ArrayList<Integer>,Integer> mp = new LinkedHashMap<>();

        int sum =0;

        for(ArrayList<Integer> list : o_l){
            if(!list.isEmpty()){
                for(int val : list){
                    sum+= val;
                }
            }
            mp.put(list, sum);
            sum=0;
        }

        for(Map.entry(ArrayList<Integer>,Integer) entry : mp.entrySet()){

        }


        System.out.println(mp);
    }
}