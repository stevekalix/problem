package Folders.NumberProblems;

public class FirstAndSecond {
    
  public static  int largest =Integer.MIN_VALUE;
  public static  int Second_largest =Integer.MIN_VALUE;

  public static  void calculate(int arr[]){

    for(int num : arr){

        if(num > largest){
            Second_largest = largest;
            largest = num;
        }
        else if(num > Second_largest && num != largest){
            Second_largest = num;
        }
    }
  }
  public static void main(String[] args) {
    
    int arr[]= new int[]{1,2,1,1,2,4,5,6,1,6,7};
    calculate(arr);
    System.out.println("First Largest "+ largest);
    System.out.println("Second Largest"+ Second_largest);

  }
    
}