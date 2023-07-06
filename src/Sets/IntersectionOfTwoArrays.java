package Sets;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {7, 3, 9};
        int[] num2 = {6, 3, 9, 2, 9, 4};

        // We find the intersection using the Two Set method:
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all the elements of the array num1 in the set1;
        for (int n : num1) {
            set1.add(n);
        }

        // Add only those elements of the num2 in the set2 which  are present in the set1/num1;
        for (int n : num2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }

        // Add the elements of the set2 to an array using the Iterator:
        int[] ans = new int[set2.size()];
        int index = 0;
        Iterator<Integer> it = set2.iterator();
        while (it.hasNext()) {
            ans[index] = it.next();
            index++;
        }

        System.out.println(Arrays.toString(ans));
     }
}
