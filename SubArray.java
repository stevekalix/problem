import java.util.ArrayList;

class SubArray{


    public static  ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void backtracking(int arr[], int index , ArrayList<Integer>ls ){

        if(index==arr.length){
            list.add(new ArrayList<>(ls));
            return ;
        }

        ls.add(arr[index]);
        backtracking(arr, index+1, ls);
        ls.remove(ls.size()-1);
        backtracking(arr, index+1, ls);


    }
    public static void main(String[] args) {
        
        int arr[]= new int[]{1,2,3};
        backtracking(arr,0,new ArrayList<>());


        System.out.println(list);
    }
}