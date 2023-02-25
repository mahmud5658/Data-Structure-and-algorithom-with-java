// merge two sorted singly linked list

public class MergeLinkedList {
    ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert value
    public void insertLast(int value) {
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

    // display linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    // merge two singly linked list with sorted order
    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeLinkedList s1 = new MergeLinkedList();
        s1.insertLast(1);
        s1.insertLast(4);
        s1.insertLast(8);
        s1.display();

        MergeLinkedList s2 = new MergeLinkedList();
        s2.insertLast(3);
        s2.insertLast(5);
        s2.insertLast(8);
        s2.insertLast(9);
        s2.insertLast(14);
        s2.insertLast(18);
        s2.display();

        MergeLinkedList result = new MergeLinkedList();

        result.head = merge(s1.head, s2.head);
        result.display();
    }
}
