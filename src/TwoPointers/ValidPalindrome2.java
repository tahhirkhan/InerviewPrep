package TwoPointers;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else {
               return palindrome(s, start+1, end) || palindrome(s, start, end-1);
            }
        }
        return true;
    }

    private static boolean palindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
