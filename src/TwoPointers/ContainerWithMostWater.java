package TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(area(height));
    }

/*
    _________________BRUTE FORCE APPROACH_________________
    static int area(int[] height) {
        int maxArea = 0;
        for (int i=0; i<height.length; i++) {
            for (int j=0; j<height.length; j++) {
                int length = Math.min(height[i], height[j]);
                int width = j - i;
                int currArea = length * width;
                maxArea = Math.max(currArea, maxArea);
            }
        }
        return maxArea;
    }
*/
    static int area(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while (start < end) {
            int length = Math.min(height[start], height[end]);
            int width = end - start;
            int currArea = length * width;
            maxArea = Math.max(currArea, maxArea);
            if (height[start] <= height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxArea;
    }

}
