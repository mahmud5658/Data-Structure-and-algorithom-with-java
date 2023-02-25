/*
Find n th from the end of a singly linked list in java 
 */

public class Node {
    ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    // find nth node from the end of a singly linked list
    public ListNode findN(int position) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        int count = 0;
        while (count < position) {
            fastPtr = fastPtr.next;
            count++;
        }
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node s1 = new Node();

        s1.insert(10);
        s1.insert(20);
        s1.insert(30);
        s1.insert(40);
        s1.insert(50);
        s1.insert(60);
        s1.insert(70);
        s1.display();
        System.out.println(s1.findN(3).data);

    }
}
