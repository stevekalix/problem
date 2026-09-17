package Folders.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Stringtwo {

    public static void main(String[] args) {

       Map<Integer,Integer> mp = new HashMap<>();
       int arr[]= new int[]{12,12,45,11,53,1,5,11,11,5,53,56,54,53};
       for(int i=0;i<arr.length;i++){
        mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
       }

       ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
       Collections.sort(list , (a,b)-> b.getValue().compareTo(a.getValue()));

     for(Map.Entry<Integer,Integer> entry : list){
         System.out.println(entry.getKey() +" " + entry.getValue());
     }

     

    }
    
}