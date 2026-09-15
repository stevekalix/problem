class PrimeNumberPro{



    public static boolean isPrime(int num){

        if(num<2){
            return false;
        }

        for(int i=2 ;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
       int n=7;
       int index =0;
       
       while (!isPrime(n)){
        index++;
        n=n+1;        
       }


    System.out.println(index);

    }
}

