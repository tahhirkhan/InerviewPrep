package ArrayBasics;

import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
////            SwapIndex(arr, start, end);
////            start++;
////            end--;
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
    }

//    private static void SwapIndex(int[] arr, int start, int end) {
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
}
