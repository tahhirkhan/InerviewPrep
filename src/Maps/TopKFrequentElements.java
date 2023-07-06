package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(frequentElements(arr, k)));
    }

    static int[] frequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            }
            else {
                map.put(n, 1);
            }
        }

        // Find the largest value in the hashMap k times,
        // add it to the answer array and remove it from the map.
        for (int i=0; i<k; i++) {
            int index = 0;
            int element = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > index) {
                    index = map.get(key);
                    element = key;
                }
            }
            ans[i] = element;
            map.remove(element);
        }

        return ans;
    }
}
