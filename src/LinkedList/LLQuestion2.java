package LinkedList;

// Q: Take elements (numbers in the range of 1-50) of a Linked List as input from the user.
//    Delete all nodes which have values greater than 25.

import java.util.LinkedList;
import java.util.Scanner;

public class LLQuestion2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five numbers between 1 and 50");
        System.out.println();
        int number = 1;
        for (int i=0; i<5; i++) {
            System.out.print("Enter number "+number+" : ");
            int n = sc.nextInt();
            list.add(n);
            number++;
        }

//        Delete all nodes which have values greater than 25:

//        for loop will not work here [reason: read the documentation of .remove() method];
//        for (int i=0; i<list.size(); i++) {
//            if (list.get(i) > 25) {
//                list.remove(i);
//            }
//        }

//      we have to use while loop here:
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
            else {
                i++;
            }
        }

        System.out.println();
        System.out.println("All the elements greater than 25 are deleted");
        System.out.println();
        System.out.println(list);
    }
}
