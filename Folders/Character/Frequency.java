package Folders.Character;
import java.util.*;
public class Frequency {

    public static void minSum(int[] arr) {

        // Step 1: Sort the digits
        Arrays.sort(arr);

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        // Step 2: Distribute digits between two numbers
        for (int digit : arr) {

            // Skip leading zeros
            if (digit == 0 && num1.length() == 0 && num2.length() == 0) {
                continue;
            }

            // Put digit into the shorter number
            if (num1.length() <= num2.length()) {
                num1.append(digit);
            } else {
                num2.append(digit);
            }
        }

        System.out.println(num1);
        System.out.println(num2);

        // If all digits are zero
        if (num1.length() == 0 && num2.length() == 0) {
           // return "0";
        }

        // If one number is empty
        if (num1.length() == 0) {
            num1.append("0");
        }

        if (num2.length() == 0) {
            num2.append("0");
        }

        // Step 3: Add the two numbers
      //  return addStrings(num1.toString(), num2.toString());
    }

    // Function to add two large numbers represented as strings
    public static String addStrings(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 10);

            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        int[] arr = {6, 8, 4, 5, 2, 3};

       minSum(arr);

     //   System.out.println(answer);
    }

    
}
