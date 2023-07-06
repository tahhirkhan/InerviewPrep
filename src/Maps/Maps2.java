package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 10);
        map.put("China", 20);
        map.put("USA", 30);
        map.put("Japan", 40);

        System.out.println(map);
//        System.out.println(map.containsKey("Japan"));
//        System.out.println(map.containsValue(30));
//        System.out.println(map.get("China"));


        // iterating through the values of a hashMap:

        // 1: -------------------using entrySet():-------------------
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        System.out.println();
        System.out.println();

        // 2: -------------------using keySet():-------------------
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));
        }

    }
}
