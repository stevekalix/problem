import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class FirstNon{
    public static void main(String[] args) {
        int a[]=new int[]{1,1,2,2,3,3,4,4,5};
        Map<Integer,Integer> mp = new LinkedHashMap<>();

        for(int n: a){
            if(mp.containsKey(n)){
                mp.put(n , mp.get(n)+1);
            }
            else{
                mp.put(n, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
            
        }
    }
}