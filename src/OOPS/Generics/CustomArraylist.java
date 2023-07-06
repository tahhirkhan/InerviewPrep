package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] reference;
    private int size = 0;
    private final int DEFAULT_SIZE = 10;

    CustomArraylist() {
        this.reference = new int[DEFAULT_SIZE];

    }

    // Add method;
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        reference[size++] = num;
    }

    private void resize() {
        int[] reference2 = new int[reference.length * 2];
        // copy current elements into the new array:
        for (int i=0; i<reference.length; i++) {
            reference2[i] = reference[i];
        }
        reference = reference2;
    }

    private boolean isFull() {
        return size == reference.length;
    }

    // get method:
    public int get(int index) {
        return reference[index];
    }

    // size method:
    public int size() {
        return reference.length;
    }

    // Set method:
    public void set(int index, int element) {
        reference[index] = element;
    }


    // IndexOf method:
    public int indexOf(int element) {
        for (int i=0; i<reference.length; i++) {
            if (reference[i] == element) {
                 return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "CustomArraylist = " +
                 Arrays.toString(reference);
    }


    public static void main(String[] args) {

//        ArrayList<Integer> list0 = new ArrayList<>();
//        list0.add(3);
//        list0.remove(0);
//        list0.size();
//        list0.set(0, 12);
//        list0.indexOf(2); // gives the index of the passed element;
//        list0.get(0); // gives the element at the passed index;


        CustomArraylist list = new CustomArraylist();
        for (int i=0; i<12; i++) {
            list.add(i+1);
        }

        list.set(0, 100);

//        for (int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        System.out.println(list);

        System.out.println(list.indexOf(3));

    }
}
