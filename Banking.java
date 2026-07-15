import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
       try{
       File file = new File("C:\\Users\\Venkatesan\\OneDrive\\Desktop\\Advanced_SAP_RAP_Hospital_Management_Project.txt");
       Scanner sc = new Scanner(file);

       while (sc.hasNext()) {
        System.out.println(sc.next());
       }
       } catch (Exception e){
        e.printStackTrace();
       }
    }
    
}
