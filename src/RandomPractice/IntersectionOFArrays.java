package RandomPractice;

import java.util.Arrays;
import java.util.HashSet;


public class IntersectionOFArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9,4,9,8,4};

        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();


        for (int i=0; i < arr1.length; i++) {
            ans1.add(arr1[i]);
        }

        for (int i=0; i < arr2.length; i++) {

            if (ans1.contains(arr2[i])) {
                ans2.add(arr2[i]);
            }

        }
        int[] ans = new int[ans2.size()];

        int i = 0;
        for (int s : ans2) {
           ans[i] = s;
           i++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
