public class pattern1 {

    static void butterfly(int m){
       
        for(int i=1 ;i<=m ;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int i_1=m-i;i_1 >=1; i_1--){
                System.out.print("  ");
            }


            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=m;i++){

            for(int j=m-i ;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        





    }

    static void dimand(int n){
        int k;

        for(int i=1; i<=n ; i++){

            for(k=n-i ; k>=1;k--){
                System.out.print(" ");
            }

            for(int j = 1 ;j<=(2*i)-1 ; j++){
                if(j==1  || j == i*2-1 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
            }
            System.out.println();
        }

    }


public static void main(String[] args) {
   // dimand(5);
   butterfly(5);
}
    
}
