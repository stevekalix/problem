package Folders.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Prefix
 */
public class Prefix {

    public static void main(String[] args) {
        
        ArrayList<String> st = new ArrayList<>();
        st.add("abc");
        st.add("abcdefg");
        st.add("ab");

        Collections.sort(st);
        System.out.println(st);


        String fst = st.get(0);
        String lst = st.get(st.size()-1);

        int i=0;

        while (i<fst.length() && i< lst.length()) {
            if(fst.charAt(i)== lst.charAt(i)){
                i++;
            }
            
        }
        System.out.println(i);
    }
}