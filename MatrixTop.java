import java.util.*;

class MatrixTop{

    public static void main(String args[]){
int arr[][] = new int[][] {
    {10, 20, 30, 40},
    {50, 60, 70, 80},
    {20, 90, 100, 110},
    {30, 70, 120, 130}
};


     HashSet<Integer> top = new HashSet<>();
     HashSet<Integer> bot = new HashSet<>();

     for(int i=0;i<arr.length;i++){
        for(int j=0;j<i;j++){
            top.add(arr[i][j]);    // Upper side digonal element 
        }
        
     }
   //  System.out.println(top);

     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            bot.add(arr[i][j]);    // Lower side digonal element
        }
     }

    //   System.out.println(bot);

       int count=0;

       for(int num : top){
        if(bot.contains(num)){     //Count the number of element in the array
            count++;
        }
       }

       System.out.println(count);

    }
}