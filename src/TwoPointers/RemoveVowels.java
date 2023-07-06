package TwoPointers;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(removeVowels(str));
    }
    static String removeVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start < end) {
            if (isVowel(chars[start]) && isVowel(chars[end])) {
                swwap(chars, start, end);
                start++;
                end--;
            }
            else if (isVowel(chars[start]) && !isVowel(chars[end])) {
                end--;
            }
            else {
                start++;
            }
        }
        return new String(chars);
    }

    private static void swwap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
