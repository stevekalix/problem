package Folders.String;

import java.util.Scanner;

public class ValidEmail {

    public static String str;

    public static void validation(String s) {

        String substring = s.substring(0, s.length() - 10);
        boolean character = false;
        boolean number = false;
        boolean Capitalcharacter = false;

        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) >= 'a' && substring.charAt(i) <= 'z') {
                character = true;
            }
            if (substring.charAt(i) >= '0' && substring.charAt(i) <= '9') {
                number = true;
            }
            if (substring.charAt(i) >= 'A' && substring.charAt(i) <= 'Z') {
                Capitalcharacter = true;
            }
        }
        if (Capitalcharacter) {
            System.out.println("Capital cannot allowed the email address");
        }
        else if (character && number && s.length() > 10 && s.contains("@gmail.com")) {
            System.out.println(s + " : That is the Valid Email");
        } else {
            System.out.println(s + " : That is the InValid Email");
        }
    }

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int num =0;
        do{ 
            System.out.println("Enter the Email : ");
            str = sc.next();
            validation(str);
            System.out.println("======1-continue  /   ===========[2-9]-break========");
          
            num = sc.nextInt();
    
        }while(num!=0);
        }catch(Exception e){
        System.err.println("Capital Letter Error");
        }
    }
}
