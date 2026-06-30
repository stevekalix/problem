import java.util.HashMap;

import java.util.Map;

class Mapavg{
    public static void main(String[] args) {
     Map<Integer,Integer> mp = new HashMap<>();

     mp.put(1, 20);
     mp.put(2,40);
     mp.put(3,30);

     int len=0;
     int tota_count=0;

     for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        tota_count+=  entry.getValue();
     }

     System.out.println(tota_count / mp.size());
    }
}