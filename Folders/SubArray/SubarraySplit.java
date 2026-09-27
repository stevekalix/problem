package Folders.SubArray;

public class SubarraySplit {
    


    public static void main(String[] args) {
        
        int arr[]= new int[]{1,2,3,4};


        int max = arr[arr.length-1];

        int paces = 0;
        int sum =0;

        int maximum  =max;

        for(int n : arr){

            if(sum+n > max){
                paces++;
                maximum = Math.max(maximum,sum);
                sum = n;
            }
            else{
                sum +=n;
            }
        }
        System.out.println(paces +" "+ maximum);

    }
}
