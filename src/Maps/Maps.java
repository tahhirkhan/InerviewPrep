package Maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("tahir", 1234);
        map.put("faisal", 7890);

        System.out.println(map);

        System.out.println(map.get("faisal"));
        System.out.println(map.containsKey("tahir"));
        System.out.println(map.containsValue(1234));
    }
}
