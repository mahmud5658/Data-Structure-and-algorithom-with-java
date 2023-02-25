//How to insert a node in a singly linked slit in java

public class SortedInsert {
    Duplication.ListNode head;

    public static class ListNode {
        int data;
        Duplication.ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int value) {
        Duplication.ListNode node = new Duplication.ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        Duplication.ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    // insert node in a sorted linked list
    public void sortedInsert(int value) {
        Duplication.ListNode newNode = new Duplication.ListNode(value);
        Duplication.ListNode current = head;
        Duplication.ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        assert temp != null;
        temp.next = newNode;
    }

    public void display() {
        Duplication.ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Duplication d = new Duplication();
        d.insert(10);
        d.insert(11);
        d.insert(11);
        d.insert(12);
        d.insert(13);
        d.insert(13);
        d.insert(15);
        d.display();
        d.sortedInsert(14);
        d.display();

    }
