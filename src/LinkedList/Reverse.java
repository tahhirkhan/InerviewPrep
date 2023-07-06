package LinkedList;

public class Reverse {
    Node head;
    Reverse() {

    }
    class Node {
        private int data;
        private Node next;

        // constructor:
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add method:
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
    }

    // Reverse Method (Iterative):
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Print method:
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void fake() {
        Node prevNode = new Node(0);
        prevNode.next = head;
        Node newHead = prevNode;
        Node node1 = prevNode.next;
        System.out.println(prevNode.next.data);
        System.out.println(newHead.data);
        System.out.println(node1.data);
    }

//    public void fake() {
//        System.out.println((head).data);
//        System.out.println((head.next).data);
//    }
    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        list.fake();
//        list.reverse();
//        list.printList();


    }
}
