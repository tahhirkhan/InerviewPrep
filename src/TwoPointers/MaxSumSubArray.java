package TwoPointers;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int k = 3;
        System.out.println(sum(nums, k));
    }
    static int sum(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int windowSum = 0;
        int maxSum = 0;

        // calculate the sum up to k elements:
        while (end < k) {
            windowSum += nums[end++];
        }

        // slide the window:
        while (end < nums.length) {
            windowSum += nums[end++] - nums[start++];
            maxSum = Math.max(windowSum, maxSum);
        }
        return Math.max(windowSum, maxSum);
    }
}
