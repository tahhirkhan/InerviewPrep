package Maps;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//        int[] nums = {1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Add the elements of the array into to HashMap:
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Traverse the map to find the element occurring more than n/3 times:
        // Traverse the map using the keySet:
        Set<Integer> keys = map.keySet();
        int target = nums.length / 3;
        for (int key : keys) {
            if (map.get(key) > target) {
                System.out.println(key);
            }
        }
    }
}
