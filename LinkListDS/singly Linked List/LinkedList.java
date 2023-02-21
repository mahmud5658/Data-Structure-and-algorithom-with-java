// A simple java program for traversal of a linked list
public class LinkedList {
    Node head;  // head of list

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /* this function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList s1 = new LinkedList();
        s1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        s1.head.next = second;
        second.next = third;

        s1.printList();
    }
}
