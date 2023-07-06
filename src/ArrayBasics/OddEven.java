package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            System.out.println("Enter the element of the array");
            int i = in.nextInt();
            if (i%2 != 0) {
                arr[start] = i;
                start++;
            }
            else {
                arr[end] = i;
                end--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
