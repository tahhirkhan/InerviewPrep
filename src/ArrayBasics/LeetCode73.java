package ArrayBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode73 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
        for (int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] index = new int[1][2];
        int indexRow = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    index[indexRow][0] = i;
                    index[indexRow][1] =j;
                    indexRow++;
                }
            }
        }

        for (int i=0; i<index.length; i++) {
            System.out.println(Arrays.toString(index[i]));

        }
        System.out.println();
        for (int i=0; i<index.length; i++) {
            set(matrix, index[i][0], index[i][1]);
        }
    }
    static void set(int[][] mat, int row, int col) {
        int m = mat.length;
        int n = mat[0].length;

        // Set row to zero:
        for (int i=0; i<n; i++) {
            mat[row][i] = 0;
        }

        // Set column to zero:
        for (int i=0; i<m; i++) {
            mat[i][col] = 0;
        }
    }
}
