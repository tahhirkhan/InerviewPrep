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

//        System.out.println("Enter the number: ");
//        int n = input.nextInt();
//        int x = 2;

        // using while loop:

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
    }
}