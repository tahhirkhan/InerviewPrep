package ArrayBasics;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];


//      Taking input in 2D array:
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

//      Printing elements of 2D array:
        System.out.println("The array is");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
