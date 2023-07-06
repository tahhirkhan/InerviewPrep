package ArrayBasics;
// https://leetcode.com/problems/spiral-matrix/description/
// Q: Spiral Matrix;
import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    public static void main(String[] args) {
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
*/
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> ans = Spiral(matrix);
        System.out.println(ans);
    }
    static List<Integer> Spiral(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        if (mat.length==0) {
            return list;
        }

        int rStart = 0;
        int rEnd = mat[0].length-1;
        int cStart = 0;
        int cEnd = mat.length-1;
        while (rStart <= rEnd && cStart <= cEnd) {

            // Add first row:
            for (int i=rStart; i<= rEnd; i++) {
                list.add(mat[rStart][i]);
            }
            cStart++;

            // Add Last Column:
            for (int i=cStart; i<=cEnd; i++) {
                list.add(mat[i][rEnd]);
            }
            rEnd--;

            // Add Last row except last element:
            if (rStart <= rEnd) {
                for (int i=rEnd; i>=rStart; i--) {
                    list.add(mat[cEnd][i]);
                }
            }
            cEnd--;

            // Add first column without first and last elements:
            if (cStart >= cEnd) {
                for (int i=cEnd; i>=cStart; i--) {
                    list.add(mat[i][rStart]);
                }
            }
            rStart++;
        }

        return list;
    }
}
