//import java.util.ArrayList;
import java.util.LinkedHashMap;
//import java.util.List;
import java.util.Map;

class FirstNon{
    public static void main(String[] args) {
        int a[]=new int[]{1,1,2,2,3,3,4,4,5};
        Map<Integer,Integer> mp = new LinkedHashMap<>();

        for(int n: a){
            mp.put( n , mp.getOrDefault(mp, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
            
        }
    }
}