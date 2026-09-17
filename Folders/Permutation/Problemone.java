package Folders.Permutation;

import java.util.ArrayList;

public class Problemone {
    public  static  ArrayList<Integer> list = new ArrayList<>();
    public  static  ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

  
    public static void com(int arr[] , int index , ArrayList<Integer> ls){
        if(index == arr.length){
            if(!ls.isEmpty()){
            list1.add(new ArrayList<>(ls));
            int pro =1;
            for(int number : ls){
                pro *= number;
            }
            list.add(pro);
            }
           return ;
        }
        ls.add(arr[index]);
        com(arr, index+1, ls);
        ls.remove(ls.size()-1);
        com(arr, index+1, ls);
    }
    public static void main(String[] args) {
        int arr[]= new int[]{2,5};
        int k = 2;
        com(arr,0,new ArrayList<>());
        
        int count =0;
        for(int num : list){
            if(num<=k){count++;}else{continue;}
        }
         System.out.println(list);
        System.out.println(list1);
        System.out.print(count);
    }
    
}
