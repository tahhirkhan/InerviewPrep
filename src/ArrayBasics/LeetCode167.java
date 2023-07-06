package ArrayBasics;

public class LeetCode167 {
    public static void main(String[] args) {
        int[] arr = {-1, 0};
        System.out.println(arr[search(arr, 1)]);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        if (start >= nums.length) {
            return end;
        }
        return start;
    }
}
