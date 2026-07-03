package Java.LinkedList;

import java.util.ArrayList;
import java.util.List;
/*
=========================================================
Problem: Convert a Compressed Linked List into an Array
=========================================================

You are given the head of a singly linked list where each node contains:

1. value -> The integer value.
2. count -> Number of consecutive occurrences of that value.

Convert the linked list back into the original array by expanding each node
according to its count.

Each node represents a consecutive group of identical elements.

Examples:

Example 1:

Input:
(1,3) -> (2,6) -> (4,4) -> (1,4)

Output:
[1,1,1,2,2,2,2,2,2,4,4,4,4,1,1,1,1]

---------------------------------------------------------

Example 2:

Input:
(5,2) -> (6,3) -> (5,2)

Output:
[5,5,6,6,6,5,5]

---------------------------------------------------------

Example 3:

Input:
(7,4)

Output:
[7,7,7,7]

---------------------------------------------------------

Constraints:

1 <= Number of Nodes <= 10^5
1 <= count <= 10^5
-10^9 <= value <= 10^9

Expected Time Complexity : O(n + m)
Expected Auxiliary Space : O(m)

where

n = Number of linked list nodes
m = Size of the reconstructed array.
*/

public class LinkedListToArray {
    class ListNode {
        int cnt ;
        int val ;
        ListNode next;

        public ListNode (int cnt, int val){
            this.cnt = cnt;
            this.val = val;
            this.next = null;
        }
    }

    public List<Integer> helper (ListNode head){
        List<Integer> ans = new ArrayList<>();
        // If the linked list is empty, return an empty array.
        if (head == null) return ans;

        ListNode curr = head;

        while (curr != null){
            int cnt = curr.cnt;
            int val = curr.val;
            for (int i = 0; i<cnt ;i++){
                ans.add(val);
            }
            curr = curr.next;
        }return ans;
    }
}
