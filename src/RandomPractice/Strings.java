package RandomPractice;

import java.util.HashMap;

public class Strings {
    public static void main(String[] args) {
        String str = "car";
        String str2 = "rat";


        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);

        boolean ans = true;
        for (int i=0; i<str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.remove(str2.charAt(i));
            }
        }
        System.out.println(map.isEmpty());
    }
}
