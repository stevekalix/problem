import java.util.ArrayList;

public class Permutation {


     static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

     static void per(int arr[] , ArrayList<Integer> ls ){



        if(ls.size()==2){
            list.add(new ArrayList<>(ls));
            return;
        }


        for(int i=0;i<arr.length;i++){
            if(ls.contains(arr[i])){
                continue;
            }

            ls.add(arr[i]);
            per(arr, ls);
            ls.remove(ls.size()-1);
        }

     }


    public static void main(String[] args) {
        
        int arr[]= new int[]{1,2,3};

        per(arr,new ArrayList<>());

        System.out.println(list.toString());
    }
    
}
