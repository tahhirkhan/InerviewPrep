package ArrayBasics;
// https://leetcode.com/problems/add-to-array-form-of-integer/submissions/882327057/
// Q: Add to Array-Form of an integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {
    public static void main(String[] args) {
    List<Integer> ans = new ArrayList<>();
    int[] num = {2, 1, 5};
    int k = 806;
    ans = addToArrayForm(num, k);
    System.out.println(ans);

    }
    static List<Integer> addToArrayForm(int[] num, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            if (i == 0) {
                n += num[i];
                while (n > 0) {
                    list.add(n % 10);
                    n /= 10;
                }
                break;
            }
            int ans;
            n += num[i];
            ans = n % 10;
            list.add(ans);
            n /= 10;

        }
        Collections.reverse(list);
        return list;
    }
}
