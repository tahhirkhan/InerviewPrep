package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            int c = divide(a, b);
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            System.out.println("This will always execute");
//        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by 0 is not allowed");
        }
        return a/b;
    }
}
