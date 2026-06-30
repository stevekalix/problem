import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {

                for (int l = n - i; l >= 1; l--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    // if (j == 1 || i==j ) {
                        System.out.print("*" + " ");
                    // }
                    // else{
                    //     System.out.print("  ");
                    // }
                }
                System.out.println();
            }

            for(int i=1;i<=n-1;i++){

                for(int l=1;l<=i;l++){
                    System.out.print(" ");
                }
                for(int j=n-i;j>=1;j--){
                   // if(j==1 || j==n-i ){
                    System.out.print("*"+" ");
              //  }
                // else{
                //     System.out.print("  ");
                // }
                }
                System.out.println();
            }
        }
    }

}
