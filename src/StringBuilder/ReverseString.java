package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
    static StringBuilder reverse(String str) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        return sb;
    }
}
