package Java.LinkedList;

import LinkedList.LinkedListCycle;

public class RemoveDuplicate {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }return head;
    }
}
