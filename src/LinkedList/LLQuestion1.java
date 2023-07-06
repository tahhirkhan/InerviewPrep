package LinkedList;

// Q: Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
//    Search for the number 7 & display its index.

import java.util.LinkedList;

public class LLQuestion1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int[] nums = {1, 5, 7, 3 , 8, 2, 3};
        for (int num : nums) {
            list.add(num);
        }

        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == 7) {
                System.out.println(i);
            }
        }
    }
}
