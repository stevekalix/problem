package Folders.Character;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {

        String str[] = new String[] { "geeksforgeeks", "geeks", "geksgeeks", "geehf", "geekeasses" };
        Arrays.parallelSort(str);

        for (String st : str) {
            System.out.println(st);
        }

        int i = 0;
        int index = 0;
        while (i < str[0].length() && i < str[str.length - 1].length()) {
            if (str[0].charAt(i) == str[str.length - 1].charAt(i)) {
                index++;
            }
            i++;
        }


        
        System.out.println(index); // 4 //2
    }

}
