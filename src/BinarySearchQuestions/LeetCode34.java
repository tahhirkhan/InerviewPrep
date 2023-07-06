package BinarySearchQuestions;

import java.util.Arrays;
//  Q: Find the first and last position of the element?
public class LeetCode34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] ans = {-1, -1};
        int target = 8;
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr, int target, boolean isFirstOccurrence) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target == arr[mid]) {
                ans = mid; // potential answer;
                if (isFirstOccurrence) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
