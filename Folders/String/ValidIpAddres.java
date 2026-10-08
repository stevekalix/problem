package Folders.String;

public class ValidIpAddres {

    public static void main(String[] args) {
        
        String st = "222.111.111.111";

        String s[] = st.split("[^0-9]");
        for(String str : s){

            System.out.println(str);
        }
    }

    
}
