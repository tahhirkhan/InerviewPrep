package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "ab_a";
//        str = str.toLowerCase().replaceAll("[^0-9a-z]", "");
//        System.out.println(str);
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^0-9a-z]", "");
        int start = 0;
        int end = str.length()-1;
        int mid = str.length()/2;
        while (start <= mid && end >= mid) {
            char first = str.charAt(start);
            char last = str.charAt(end);
            if (first != last) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
