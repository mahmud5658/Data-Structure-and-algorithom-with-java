public class SinglyLinkedList {
    private ListNode head;
    public static class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int counting() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        // Now we will connect them together to form chain
        s1.head.next = second;
        second.next = third;
        third.next = fourth;
        s1.display();
        System.out.println(s1.counting());
    }
}
