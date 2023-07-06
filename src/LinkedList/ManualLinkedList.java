package LinkedList;

public class ManualLinkedList {
    Node head;
    private int size;
    ManualLinkedList() {
        this.size = 0;
    }

    public static void main(String[] args) {
        ManualLinkedList list = new ManualLinkedList();
        list.addAtFirst("My");
        list.addAtLast("Name");
        list.addAtLast("is");
        list.addAtLast("Tahir");
        list.printList();

//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
        System.out.println(list.size());
        list.head = list.reverseRecursive(list.head);
        list.printList();
        System.out.println(list.size());
    }


    class Node {
        String data;
        Node next;

        // Constructor:
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add a Node at the beginning:
    public void addAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the last:
    public void addAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Now we have reached the last node:
        currNode.next = newNode;
    }

    // Delete first Node:
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete Last Node:
    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    // Reverse Linked List (iterative):
    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update:
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse LinkedList (Recursive):
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Size of the list:
    public int size() {
        return this.size;
    }

    // Print the list:
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


}
