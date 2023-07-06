package ArrayBasics;
import java.util.Arrays;
// Q: Search in a matrix which is both row-wise and col-wise sorted?
public class RowColMatrix {
    public static void main(String[] args) {
//        int[][] arr = {
//                {10, 14, 17},
//                {11, 16, 19},
//                {12, 18, 21}
//        };
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] ans = search(arr, 12);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length-1;

        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {
                return new int[]{row, col};
            }

            if (target > arr[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }


        return new int[]{-1, -1};
    }

}
