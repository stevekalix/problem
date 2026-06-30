import java.util.ArrayList;
import java.util.List;

class Matrix{

    public static void main(String[] args) {
        int arr[][]= new int[][]{ {1,2,3} ,{4,5,6} ,{7,8,9} };
        int ar[][] = new int[arr.length][arr.length];

        List<List<Integer>>  ouList = new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            

            for(int j=0;j<arr[0].length;j++){
               ar[j][i] = arr[i][j];
            }
        
        }

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }



       


    }
}