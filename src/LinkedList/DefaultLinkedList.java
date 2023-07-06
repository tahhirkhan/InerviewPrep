package LinkedList;
import java.util.*;

public class DefaultLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // LinkedList methods:
        list.add(1);
        list.add(2);
        list.add(4);
        list.remove(0);
        list.get(0);
        list.size();
        list.addFirst(9);
        list.removeFirst();
        System.out.println(list);
    }
}
