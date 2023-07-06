package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//          ===================BASICS================
//        int a = 3;
//        int b = 4;
//
//        int sum = a + b;
//        System.out.println(sum);
//
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        int s = a + b;
//        System.out.println("The sum of a and b is: "+s);

//        String name = input.nextLine();
//        System.out.println(name);


//         ===================Prime number check================

//        System.out.print("Enter the number: ");
//        int n = input.nextInt();
//        int x = 2;
//
//        // using while loop:
//
//        while (x <= n/2) {
//            if (n%x == 0) {
//                System.out.println("Non Prime");
//                break;
//            }
//            else {
//                System.out.println("Prime");
//            }
//            x++;
//        }

//          using for loop:

//        for (int i = 2; i <= n/2; i++) {
//            if (n%i == 0) {
//                System.out.println("Non Prime");
//                break;
//            }
//            else {
//                System.out.println("Prime");
//            }
//        }


//         ======================COUNT NUMBERS================

//        int n = 44443444;
//        int rem = 0;
//        int count = 0;
//        while (n != 0) {
//            rem = n % 10;
//            if (rem == 4) {
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);


//        ======================FIBONACCI SERIES================

//        int a = 0;
//        int b = 1;
//        System.out.print("Enter the value of n: ");
//        int n = input.nextInt();
//
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//        for (int i=0; i<n; i++) {
//            int c = a+b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }




//        ======================LARGEST NUMBER================

//        System.out.print("Enter the value of a: ");
//        int a = input.nextInt();
//
//        System.out.print("Enter the value of b: ");
//        int b = input.nextInt();
//
//        System.out.print("Enter the value of c: ");
//        int c = input.nextInt();
//
//        System.out.print("Enter the value of d: ");
//        int d = input.nextInt();
//
//        int max = Math.max(d, Math.max(c, Math.max(a, b)));
//        System.out.print("The largest value is: "+max);




//        ======================REVERSE A NUMBER================

//        System.out.print("Enter the number: ");
//        int n = input.nextInt();
//        System.out.print("The original number is: "+n);
//        System.out.println();
//
//        int rem = 0;
//        while (n != 0) {
//            rem = rem * 10 + (n%10);
//            n = n/10;
//        }
//        System.out.print("The reversed number is: "+rem);





//      ======================ARRAY INPUT================
//        int[] arr = new int[5];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));






//        ====================== HAPPY NUMBER ================
//        int n = 25;
//        boolean ans = happyNumber(n);
//        System.out.println(ans);
//
//    }
//    static boolean happyNumber(int n) {
//        int square = 0;
//        int rem = 0;
//        while (n > 0) {
//            rem = n % 10;
//            square += rem * rem;
//            if (square == 1) {
//                return true;
//            }
//            n = n/10;
//            if (n <= 0) {
//                n = square;
//                square = 0;
//            }
//        }
//        return false;
//    }




//        ======================SEARCH IN MATRIX================
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[] ans = search(matrix[2], 2, 9);
//        System.out.println(Arrays.toString(ans));
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int rows = image.length;
        int rEnd = image[0].length;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rEnd; j++) {
                // swap:
                int temp = image[i][j];
                image[i][j] = image[i][rEnd-1];
                image[i][rEnd-1] = temp;
                rEnd--;
            }
        }

        for (int i=0; i<rows; i++) {
            for (int j=0; j<rEnd; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
                else {
                    image[i][j] = 1;
                }
            }
        }

        for (int[] ints : image) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
//        int ans = smallest(matrix, 8);
//        System.out.println(ans);


    }

//    static int smallest(int[][] matrix, int k) {
//        int[] arr = new int[(matrix.length) * (matrix[0].length)];
//        int count = 0;
//        for (int i=0; i<matrix.length; i++) {
//            for (int j=0; j<matrix[0].length; j++) {
//                arr[count] = matrix[i][j];
//                count++;
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        return arr[k-1];
//    }
//    static int[] search(int[] arr, int row, int target) {
//
//        int start = 0;
//        int end = arr.length-1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            }
//            else if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else {
//                return new int[]{row, mid};
//            }
//        }
//        return new int[]{-1, -1};
//    }

}