package Folders.String;

public class Stringthree {

    public static void main(String[] args) {

    String st = "abs123lk214kj213pmd53";
    
    int arr[] = new int[]{1,2,3,4,5,6};
    int prefix[]= new int[arr.length];

    prefix[0]= arr[0];
    for(int i=1;i<arr.length;i++){
        prefix[i]= prefix[i-1]+arr[i];
    }

    int a[]= new int[]{3,5};
    int i = a[0];
    int j = a[1];

    for(int num : prefix){
        System.out.println(num+" ");
    }

    System.out.println(i +" "+ j + " === "+ Math.abs((prefix[i-1]-prefix[j])));
    }
}
