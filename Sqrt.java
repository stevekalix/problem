import java.math.*;
class Sqrt{

    public static void main(String a[]){

        int arr[] = new int[]{11, 23 , 25 , 16 , 36 , 89 , 81 };

        for(int n : arr){

            int sqrt = (int)Math.sqrt(n);
            if(sqrt*sqrt == n){
                System.out.print(n+" ");
            }

        }
    }
}