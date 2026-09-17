package Folders.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WithoutRepeating {

    public static void main(String[] args) {
        
        String str = "abcabcdeabs"; // to find the wothput repeating maximum character

        ArrayList<Character> st = new ArrayList<>();
        int max =0;
        int left =0;
        for(int right =0; right<str.length();right++){

            while (st.contains(str.charAt(right))) {
                st.remove(left);
                left++;
             
            }
            st.add(str.charAt(right));

            max = Math.max(max, right-left+1);
        } 
        System.out.println(max);
    }
    
}
