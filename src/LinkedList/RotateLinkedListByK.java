package LinkedList;

public class RotateLinkedListByK {

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode helper(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        ListNode tail = head;

        int len = 1;

        // Find length
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Optimize rotations
        k %= len;

        // If no rotation needed
        if (k == 0)
            return head;

        // Make circular linked list
        tail.next = head;

        ListNode temp = head;

        int cnt = len - k;

        // Find new tail
        while (cnt != 1) {
            temp = temp.next;
            cnt--;
        }

        // Break list
        head = temp.next;
        temp.next = null;

        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    // Driver Code
    public static void main(String[] args) {

        /*
            1 -> 2 -> 3 -> 4 -> 5
            k = 2

            Output:
            4 -> 5 -> 1 -> 2 -> 3
        */

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original Linked List:");
        printList(head);

        head = helper(head, k);

        System.out.println("Rotated Linked List:");
        printList(head);
    }
}