import java.util.ArrayList;

class PermutationSubStringcheck{
    public static ArrayList<String> list = new ArrayList<>();

    public static boolean per(char arr[] ,String fat , ArrayList<Character> ls ){

        if(ls.size() == fat.length()){
            String s = "";
            for(char c : ls){
                s+=c;
            }
            list.add(s);
            s = "";         
        }

        for(int i=0;i<arr.length;i++){
            if(ls.contains(arr[i])){
                continue;
            }
            ls.add(arr[i]);
            per(arr, fat, ls);
            ls.remove(ls.size()-1);
        }
        return  false;
    }

    public static void main(String[] args) {
        
        String st = "abcd";
        String fat = "ek";
        char ch[]= st.toCharArray();
      
        System.out.println(  per(ch,fat,new ArrayList<>()));
        System.out.println(list);
    }
}