// find middle in linked list

public class Middle {
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

    // find middle number
    public ListNode findMiddle() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
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
        Middle m1 = new Middle();
        m1.insert(10);
        m1.insert(20);
        m1.insert(30);
        m1.insert(40);
        m1.insert(50);
        m1.insert(60);
        m1.insert(70);
        m1.insert(80);
        m1.insert(90);
        m1.display();
        System.out.println(m1.findMiddle().data);
    }
}
