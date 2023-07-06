package RandomPractice;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(number(nums));
    }
    static int number(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                return nums[i];
            }
            else {
                i = i+2;
                j = i+1;
            }
        }
        return 0;
    }
}
