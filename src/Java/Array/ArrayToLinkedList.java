package Java.Array;
/*
===========================================
Problem: Compress Consecutive Elements into a Linked List
===========================================

Given an integer array, create a singly linked list where each node stores:

1. The value.
2. The count of consecutive occurrences of that value.

If the same value appears again later after a different value, create a new node.

Example 1:

Input:
[1,1,1,2,2,2,2,2,2,4,4,4,4,1,1,1,1]

Output:
(1,3) -> (2,6) -> (4,4) -> (1,4) -> NULL

Explanation:
The first group of 1's is stored separately from the last group because
they are not consecutive.

Example 2:

Input:
[5,5,6,6,6,5,5]

Output:
(5,2) -> (6,3) -> (5,2) -> NULL

Constraints:
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(k)
where k is the number of consecutive groups.
*/

public class ArrayToLinkedList {
         class ListNode {
             int cnt;
             int val;
             ListNode next;

             public ListNode(int cnt, int val) {
                 this.cnt = cnt;
                 this.val = val;
                 this.next = null;
             }
         }

         public ListNode helper(int [] arr){
                if (arr.length == 0) return null;
            ListNode head = null;
            int cnt = 1;
            int val = arr[0];
            ListNode curr = null;
            for (int i =1;i<arr.length;i++){
                if (val == arr[i]){
                    cnt ++;
                }else {
                    ListNode node = new ListNode(cnt , val);
                    // First Node
                    if (head == null){
                        head = node;
                        curr = node;
                    }else {   // for upcmoing node
                        curr.next = node;
                        curr = curr.next;
                    }
                    cnt =1;
                    val = arr[i];
                }
            }
             // Edge Case:
            // The last group is never added inside the loop because a node is
            // created only when a different value is encountered.
            // Therefore, we must explicitly create the final node after the loop.
            //
            // Example:
            // [1,1,1,1]       -> (1,4)
            // [1,1,1,1,2,2,2] -> (1,4) -> (2,3)
            ListNode node = new ListNode(cnt , val);
            if(head == null){
                head = node;
            }else {
                curr.next = node;
            }
            return head;
        }
}
