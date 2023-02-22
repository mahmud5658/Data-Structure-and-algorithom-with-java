/*
In singly linked list,how to delete first item and second item or given position item.
 */

public class SinglyLinkedList6 {
    private ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // delete first item
    public void deleteFirst() {
        ListNode current = head;
        head = head.next;
        current.next = null;

    }

    // delete given position
    public void deletePosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // delete last
    public void deleteLast() {
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        assert previous != null;
        previous.next = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList6 s1 = new SinglyLinkedList6();
        s1.insert(2);
        s1.insert(3);
        s1.insert(4);
        s1.insert(5);
        s1.insert(6);
        s1.insert(7);
        s1.display();
        s1.deletePosition(6);
        s1.display();
        s1.deleteFirst();
        s1.display();
        s1.deleteLast();
        s1.display();
    }
}
