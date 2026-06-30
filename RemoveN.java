
public class RemoveN {
    public static void main(String a[]){
        int arr[] = new int[]{2,3,4,5,1,2};
        int remove = 2;

        int p=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=remove){
                arr[p]=arr[i];
                p++;
            }
        }

        System.out.println(p);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    
}
