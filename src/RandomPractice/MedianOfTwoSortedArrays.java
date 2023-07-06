package RandomPractice;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        median(nums1, nums2);
    }

    static double median(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        for (int i=0; i<nums1.length; i++) {
            ans[i] = nums1[i];
        }

        for (int i=nums1.length-1; i<nums2.length; i++) {
            ans[i] = nums2[i];
        }

        System.out.println(Arrays.toString(ans));
        return 0;
    }
}
