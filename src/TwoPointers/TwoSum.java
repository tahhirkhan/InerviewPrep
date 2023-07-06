package TwoPointers;

import java.util.Arrays;

public class TwoSum {
    // input array is sorted.
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 1;
        int j = nums.length-1;
        while (i <= nums.length && j > 1) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
            if (nums[i] + nums[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
