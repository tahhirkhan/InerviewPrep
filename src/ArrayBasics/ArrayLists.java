package ArrayBasics;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

/*
        list.add(5);
        list.add(6);
        System.out.println(list);
*/

        for (int i=0; i<5; i++) {
            list.add(in.nextInt());
        }

        System.out.print("The whole list: ");
        System.out.println(list);

//      Get index in range:

        System.out.print("List in range of 2 and 4: ");
        for (int i=2; i<=4; i++) {
            System.out.print(list.get(i)+" ");
        }


    }
}
