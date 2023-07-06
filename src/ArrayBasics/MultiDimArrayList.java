package ArrayBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = 3;
        int col = 5;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//      initialization:
        for (int i=0; i<row; i++) {
            list.add(new ArrayList<>(col));
        }

//      adding elements:
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                list.get(i).add(in.nextInt());
            }
        }

//      printing elements:
//        for (int i=0; i<row; i++) {
//            for (int j=0; j<col; j++) {
//                System.out.print(list.get(i)+" ");
//            }
//            System.out.println();
//        }
        System.out.println(list);
    }
}
