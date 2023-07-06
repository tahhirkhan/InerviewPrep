package ArrayBasics;
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
// Q: Find all the lucky numbers in a matrix;
import java.util.ArrayList;
import java.util.List;

public class LeetCode1380 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };
        List<Integer> ans = luckyNumbers(mat);
        System.out.println(ans);
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int min;
        int col = 0;
        // Find minimum element in the row:
        for (int[] ints : matrix) {
            min = ints[0];
            for (int j = 0; j < matrix[0].length; j++) {

                if (ints[j] < min) {
                    min = ints[j];
                    col = j;
                }
            }
            // Check if it is max in column:
            if (isMaxInCol(matrix, col, min)) {
                ans.add(min);
            }
        }
        return ans;
    }
    static boolean isMaxInCol(int[][] mat, int minCol, int min) {
        for (int[] ints : mat) {
            if (ints[minCol] > min) {
                return false;
            }
        }
        return true;
    }
}
