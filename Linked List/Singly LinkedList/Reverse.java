// Reverse a singly linked list

public class Reverse {
    Search.ListNode head;

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert linked list value
    public void insert(int value) {
        Search.ListNode node = new Search.ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        Search.ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    // reverse linked list
    public void reverse() {
        Search.ListNode current = head;
        Search.ListNode previous = null;
        Search.ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    // display the linked list
    public void display() {
        Search.ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Search s1 = new Search();
        s1.insert(10);
        s1.insert(11);
        s1.insert(12);
        s1.insert(13);
        s1.insert(14);
        s1.insert(15);
        s1.display();
        s1.reverse();
        s1.display();
    }
}
