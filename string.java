import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class string {
    
    public static void main(String[] args) {
        
        String str ="1,1,2,3,3,4,4,5,5,5,5,6";
        String a[]= str.split(",");
        List<Integer> ls = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            ls.add(Integer.parseInt(a[i]));
        }

    System.out.println(ls);
    Set<Integer> dp= new LinkedHashSet<>();
    List<Integer> np= new ArrayList<>();
    for(int it : ls){
        if(np.contains(it)){
            dp.add(it);
        }
        np.add(it);
    }

    System.out.println(dp);
    }
}
