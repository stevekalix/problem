import java.util.Arrays;

class Num{
    public static void main(String[] args) {
        int a[]= new int[]{10,9,8,7,6,5,4,3,2,1};
        Arrays.parallelSort(a);
        int l = a.length/2;
        int r = a.length-1;

        while( l< r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;

            l++;
            r--;
        }
        for(int i: a){
            System.err.print(i+ " ");
        }

    }
}