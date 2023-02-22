// Search specific number in singly linked list
public class Search {
    ListNode head;

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

    // search the user input number
    public boolean search(int searchKey) {
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;

        }
        return false;
    }

    // display the linked list
    public void display() {
        ListNode current = head;
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
        System.out.println(s1.search(7));
        s1.display();
    }
}
