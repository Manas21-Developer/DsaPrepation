package LinkedList;

public class MergeTwoSortedListRecursive {

    // Node Class
    public static class ListNode {

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

    // Merge Function
    public ListNode mergeTwoLists(ListNode l1,
                                  ListNode l2) {

        // Base Cases
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        // Compare values
        if (l1.val < l2.val) {

            l1.next = mergeTwoLists(l1.next, l2);

            return l1;
        }

        l2.next = mergeTwoLists(l1, l2.next);

        return l2;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " -> ");

            head = head.next;
        }

        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        MergeTwoSortedListRecursive obj =
                new MergeTwoSortedListRecursive();

        // First Linked List
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Second Linked List
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println("List 1:");
        printList(l1);

        System.out.println("List 2:");
        printList(l2);

        // Merge Lists
        ListNode result =
                obj.mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printList(result);
    }
}