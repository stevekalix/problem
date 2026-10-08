package Folders.String;

/**
 * NumberSum
 */
public class NumberSum {


    public static void main(String[] args) {
        
        String st = "karpagam123 Institute43 of techonology 98";

          //String s = st.replaceAll("[^0-9]+"," ");
          String arr[]= st.split("[^0-9]+");
          int s =0;
        for(String v : arr){
            System.out.print(v+" ");
        }
       

    }
    
}