package RandomPractice;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(findProduct(nums)));
    }

    static int[] findProduct(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int noOfZeroes = 0;
        int zeroIndex = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                noOfZeroes++;
                zeroIndex = i;
            }
            else {
                product *= nums[i];
            }
        }

        // if the noOfZeroes > 1:
        if (noOfZeroes > 1) {
            return ans;
        }

        // if the noOfZeroes == 1;
        if (noOfZeroes == 1) {
            ans[zeroIndex] = product;
            return ans;
        }

        // if array does not contain any zeroes:
        for (int i=0; i<nums.length; i++) {
            ans[i] = product / nums[i];
        }
        return ans;
    }
}
