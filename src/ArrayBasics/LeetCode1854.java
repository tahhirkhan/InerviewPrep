package ArrayBasics;

import java.util.Arrays;

public class LeetCode1854 {
    public static void main(String[] args) {
        int[][] logs = {
                {1950, 1961},
                {1960, 1971},
                {1970, 1981}
        };
        System.out.println(year(logs));
    }
    static int year(int[][] logs) {
        int[] arr = new int[32];
        for (int[]log : logs) {
            int by = log[0] - 1950;
            int dy = log[1] -1950;
            arr[by]++;
            arr[dy]--;
        }

        // prefix sum:
        int max = 0;
        for (int i=1; i< arr.length; i++) {
            arr[i] += arr[i - 1];
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max + 1950;
    }
}
