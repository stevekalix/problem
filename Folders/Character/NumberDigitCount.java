package Folders.Character;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumberDigitCount {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

    public static int total_count_digit = 0;

    public static boolean isPrime(int num) { // find the all prime numbers in the particular range
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void digitcount(String str, int a, int b, int c) { // There find the digit count for 3,4,1

        int count = 0;
        char ch[] = str.toCharArray();
        ArrayList<Integer> inerar = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            inerar.add(ch[i] - '0');
            if (ch[i] - '0' == a || ch[i] - '0' == b || ch[i] - '0' == c) {
                count++;
            }
        }
        list2.add(new ArrayList<>(inerar));
        total_count_digit += count;
    }

    public static void main(String[] args) {

        int num = 100; // There fing the all prime digit number in 3 and 4 and 1
        int a = 3;
        int b = 4;
        int c = 1;

        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                list.add(i);
            } else {
                continue;
            }
        }

        int count = 0;
        for (int arr_list : list) {
            digitcount(String.valueOf(arr_list), a, b, c);
        }

        System.out.println(list.toString());

        for (ArrayList<Integer> l_1 : list2) {
            System.out.println(l_1);
        }

        System.out.print("total_count_digit  : " + total_count_digit);
    }

}
