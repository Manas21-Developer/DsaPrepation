package LinkedList;

public class DetectAndRemoveCycleInLinkedList {

    // Node Structure
    static class Node {

        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    // Remove Loop Function
    public static void removeLoop(Node head) {

        // Cycle Detection
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Loop Detected
            if (fast == slow) {

                helper(head, fast);
                return;
            }
        }
    }

    // Helper Function
    public static void helper(Node slow, Node fast) {

        // Special Case:
        // Loop starts from head
        if (slow == fast) {

            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
            return;
        }

        Node prev = null;

        // Find starting point of loop
        while (slow != fast) {

            prev = fast;

            slow = slow.next;
            fast = fast.next;
        }

        // Remove loop
        prev.next = null;
    }

    // Print Linked List
    public static void printList(Node head) {

        while (head != null) {

            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    // Driver Code
    public static void main(String[] args) {

        /*
                1 -> 2 -> 3 -> 4 -> 5
                           ^         |
                           |_________|

                Loop starts at node 3
        */

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating Loop
        head.next.next.next.next.next = head.next.next;

        // Remove Loop
        removeLoop(head);

        // Print Corrected List
        System.out.println("Linked List After Removing Loop:");

        printList(head);
    }
}
