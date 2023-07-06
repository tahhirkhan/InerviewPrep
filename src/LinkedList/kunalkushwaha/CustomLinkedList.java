package LinkedList.kunalkushwaha;

public class CustomLinkedList {

    CustomLinkedList() {

    }

    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
    Node tail;

    // Insert at beginning method:
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at the middle (when node is given);
    public void insert(int val, Node A) {
        if (head == null) {
            addFirst(val);
        }
        Node newNode = new Node(val);
        newNode.next = A.next;
        A.next = newNode;
    }

    // Insert at the middle [ITERATIVE] (when position is given):
    public void insertI(int val, int position) {
        if (position == 0) {
            addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        int i = 1;
        while (i < position && temp != null) {
            temp = temp.next;
            i++;
        }
        assert temp != null;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert at the middle [RECURSIVELY] (when index/position is given):
    public void insertR(int val, int index) {
        head = insertR(val, index, head);
    }
    private Node insertR(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            return newNode;
        }
        node.next = insertR(val, index-1,  node.next);
        return node;
    }

    //Insert at the end method:
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Delete at the beginning:
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // Delete at any middle position:
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        if (head.next.next == null) {
            deleteLast();
        }
        Node temp = head;
        int i = 1;
        while (temp != null && i < position) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    // Delete at the end:
    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
    }

    // Get Node:
    public Node getNode(int val) {
        if (head == null) {
            System.out.println("List is empty");
            return head;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                break;
            }
            temp = temp.next;
        }

        return temp;
    }

    // Print List:
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("("+temp.val+")-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
//        list.addFirst(12);
//        list.addFirst(13);
//        list.addFirst(14);
//        list.printList();
        list.addLast(17);
        list.addLast(18);
        list.addLast(2);
        list.addLast(3);
        list.addLast(99);
//        list.printList();

        list.insertI(100, 3);
        list.printList();
//        list.deleteFirst();
//        list.printList();

//        System.out.println(list.getNode(12).val);

//        list.delete(3);
//        list.printList();

//        list.deleteLast();
//        list.printList();
        list.insertR(101, 2);
        list.printList();
    }

}
