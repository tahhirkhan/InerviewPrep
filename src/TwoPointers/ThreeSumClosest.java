package TwoPointers;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(sum(nums, target));
    }
    static int sum(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end) {
                int current_sum = nums[i] + nums[start] + nums[end];
                if (current_sum > target) {
                    end--;
                }
                else {
                    start++;
                }

                if (Math.abs(current_sum - target) < Math.abs(result - target)) {
                    result = current_sum;
                }
            }
        }
        return result;
    }
}
