package Folders.SubArray;

import java.util.ArrayList;

public class Triblet {
    
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};


        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int t = 4;

        for(int i=0;i<a.length;i++){
            int left = i+1;
            int right = a.length-1;

            while (left<right) {
                int sum = a[left]+a[i]+a[right];
                ls.add(sum);
                

            }
        }
    }
}
