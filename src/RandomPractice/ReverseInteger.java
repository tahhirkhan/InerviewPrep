package RandomPractice;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    static int reverse(int n) {
        boolean isNegative = false;
        if (n < 0) {
            n = n * (-1);
            isNegative = true;
        }

        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        }
        if (isNegative) {
            return ans * (-1);
        }
        return ans;
    }
}
