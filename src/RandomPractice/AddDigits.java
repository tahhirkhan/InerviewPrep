package RandomPractice;

public class AddDigits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if (n <= 9) {
            return n;
        }
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (sum <= 9) {
            return sum;
        }
        return sum(sum);
    }
}
