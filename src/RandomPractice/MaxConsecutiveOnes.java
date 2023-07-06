package RandomPractice;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(ones(nums));
    }

    static int ones(int[] nums) {
        int currentStreak = 0;
        int maxStreak = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                currentStreak++;
            }
            else {
                maxStreak = Math.max(currentStreak, maxStreak);
                currentStreak = 0;
            }
        }
        return Math.max(currentStreak, maxStreak);
    }
}
