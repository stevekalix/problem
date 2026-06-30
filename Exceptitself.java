import java.util.*;

public class Exceptitself {
    public static void main(String[] args) {

        int a[]=new int[]{1,2,3,4};
        int n=a.length;
        int pre[]=new int[n];
        pre[0]=1;

        int suff[]=new int[n];
        suff[n-1]=1;

        for(int i=1;i<n;i++){
            pre[i]= pre[i-1]*a[i-1];
        }

        for(int j=n-2 ;j>=0;j--){
            suff[j]= suff[j+1]*a[j+1];
        }

        List<Integer> ls =  new ArrayList<>();

        for(int i=0;i< n ;i++){
            ls.add(suff[i]* pre[i]);
        }
        System.out.print(ls);

    }
    
}
