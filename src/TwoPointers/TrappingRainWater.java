package TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
//        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(rainWaterArea(height));
    }

/*
    static int rainWaterArea(int[] height) {
        int ans = 0;
        for (int i=1; i<height.length-1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j=i; j>=0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j=i; j<height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            ans += Math.min(leftMax, rightMax) - height[i];
        }
        return ans;
    }
*/
    static int rainWaterArea(int[] height) {
        int left = 0, right = height.length-1, ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }
                else {
                    ans += (leftMax - height[left]);
                }
                left++;
            }
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }
                else {
                    ans += (rightMax - height[right]);
                }
                right--;
            }
        }
        return ans;
    }

}
