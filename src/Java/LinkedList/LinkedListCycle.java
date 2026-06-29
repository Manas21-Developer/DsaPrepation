package LinkedList;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

            // Creating nodes
            ListNode head = new ListNode(3);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(0);
            ListNode fourth = new ListNode(-4);

            // Connecting nodes
            head.next = second;
            second.next = third;
            third.next = fourth;

            // Creating a cycle
            fourth.next = second;

            System.out.println("Cycle Present: " + hasCycle(head));
    }
}
