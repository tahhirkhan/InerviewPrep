package RandomPractice;

import java.util.Arrays;

public class PrefixSumAlgorithm {
    public static void main(String[] args) {
        int[] nums = {6, 3, -2, 4, -1, 0, -5};
        int currSum = 0;
        for (int i=0; i<nums.length; i++) {
            currSum += nums[i];
            nums[i] = currSum;
        }

        // calculate sum between range 0 to 4;
//        System.out.println(nums[4]);

        // calculate sum between range 2 to 6;
        int sumBetweenRange = nums[6] - nums[1];
        System.out.println(sumBetweenRange);
    }
}
