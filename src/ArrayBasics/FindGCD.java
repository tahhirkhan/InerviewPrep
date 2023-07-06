package ArrayBasics;

public class FindGCD {
    public static void main(String[] args) {
        System.out.println(findGCD(12, 8));
    }
    static int findGCD(int x, int y) {
        int n = Math.max(x, y);
        int gcd = 1;
        for (int i=1; i<=n; i++) {
            if (x%i == 0 && y%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
