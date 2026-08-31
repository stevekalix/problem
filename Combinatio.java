import java.util.ArrayList;
public class Combinatio {


    static ArrayList<Integer>list = new ArrayList<>();

    public static void com(int a[] , int index , ArrayList<Integer> ls){


        if(ls.size()==2){
           
           int sum =0;
           for(int val : ls){
            sum+=val;
           }
           list.add(sum);
           sum =0;
           return;
        }
        if(index==a.length){
            return;
        }

        ls.add(a[index]);
        com(a, index+1, ls);
        ls.remove(ls.size()-1);
        com(a,index+1 , ls);
    }
    

    public static void main(String[] args) {
        
        int arr[]= new int[]{1,2,3,4,5};

        com(arr, 0, new ArrayList<>());

        System.out.println(list);
      
    }
}
