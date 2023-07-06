package RandomPractice;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(zeroes(nums)));
    }
    static int[] zeroes(int[] nums) {
        int[] ans = new int[nums.length*2];

        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                ans[index] = 0;
                ans [index+1] = 0;
                index = index+2;
            }
            else {
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = ans[i];
        }
        return nums;
    }
}
