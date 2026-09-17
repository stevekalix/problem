package Folders;
import java.util.ArrayList;

public class Problemtwo{


    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void com(int arr[] , int index , int target , ArrayList<Integer> ls ){
        if(index == arr.length){
            if(!ls.isEmpty()){
            int sum =0;
            for(int num : ls){
                sum = sum+num;
            }
            if(sum==target){
                list.add(new ArrayList<>(ls));
            }
            }
            return ;
        }

        ls.add(arr[index]);
        com(arr, index+1, target, ls);
        ls.remove(ls.size()-1);
        com(arr, index+1, target, ls);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40};
        int target = 30;
        com(arr,0,target,new ArrayList<>());
        System.out.println(list);
    }
   
    
}