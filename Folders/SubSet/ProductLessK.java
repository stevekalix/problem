import java.util.ArrayList;
import java.util.Collections;

class ProductLessK {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void  com(int a[] , ArrayList<Integer> ls ){

        if(ls.size()== 3){
            
            list.add(new ArrayList<>(ls));
            return ;
        }

        for(int i=0;i<a.length;i++){
            if(ls.contains(a[i])){
                continue;
            }

            ls.add(a[i]);
            com(a, ls); 
            ls.remove(ls.size()-1);
        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };

        com(a, new ArrayList<>());

        System.out.println(list);

    }
}
