package RandomPractice;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(sequence(nums));
    }
    static int sequence(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            if (i < nums.length-1 && nums[i] == nums[i+1]-1) {
                count++;
            }

        }
        return count;
    }
}
