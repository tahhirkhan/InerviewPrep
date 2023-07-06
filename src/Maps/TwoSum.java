package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

// ________________________ Using Two Pass HashMap_________________________
//        for (int i=0; i<nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i=0; i<map.size(); i++) {
//            int ans = target - nums[i];
//            if (map.containsKey(ans) && map.get(ans) != i) {
//                return new int[] {i, map.get(ans)};
//            }
//        }
//        return new int[] {-1, -1};


// ________________________ Using One Pass HashMap_________________________
        for (int i=0; i<nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans) && map.get(ans) != i) {
                return new int[] {i, map.get(ans)};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
