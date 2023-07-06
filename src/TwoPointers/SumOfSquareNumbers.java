package TwoPointers;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 1000000;
        System.out.println(isSum(c));
    }
    static boolean isSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);
        while (start <= end) {
            long sum = (start * start) + (end * end);
            if (sum == c) {
                return true;
            }
            if (sum > c) {
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }
}
