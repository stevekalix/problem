import java.util.ArrayList;
import java.util.Arrays;

public class Number {

    public static void main(String[] args) {
        
        String st="100addedinto250withe500numberis8000"; // output=100,250,500,8000

        String s[] = st.split("[a-zA-Z]+");

        // for(String val : s){
        //     System.out.println(val);
        // }

        int max_value=0;
        for(String val : s){
            int curr = Integer.parseInt(val);
            max_value = Math.max(max_value,curr);
        }
        System.out.println(max_value);

        
    }
    
}
