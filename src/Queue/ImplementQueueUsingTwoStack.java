package Queue;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Push Operation
    void push(int x) {

        st1.push(x);

        System.out.println(x + " inserted into queue");
    }

    // Pop Operation
    int pop() {

        // Transfer elements only if st2 is empty
        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {

                st2.push(st1.pop());
            }
        }

        // Queue Empty
        if (st2.isEmpty()) {

            System.out.println("Queue is Empty");

            return -1;
        }

        return st2.pop();
    }

    // Peek Operation
    int peek() {

        // Transfer only when needed
        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {

                st2.push(st1.pop());
            }
        }

        // Queue Empty
        if (st2.isEmpty()) {

            System.out.println("Queue is Empty");

            return -1;
        }

        return st2.peek();
    }

    // Check Empty
    boolean isEmpty() {

        return st1.isEmpty() && st2.isEmpty();
    }

    // Driver Code
    public static void main(String[] args) {

        ImplementQueueUsingTwoStack q =
                new ImplementQueueUsingTwoStack();

        // Push Elements
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println();

        // Peek Front Element
        System.out.println(
                "Front Element: " + q.peek());

        System.out.println();

        // Pop Elements
        System.out.println(
                "Removed Element: " + q.pop());

        System.out.println(
                "Removed Element: " + q.pop());

        System.out.println();

        // Peek Again
        System.out.println(
                "Front Element: " + q.peek());

        System.out.println();

        // Check Empty
        System.out.println(
                "Is Queue Empty? " + q.isEmpty());

        System.out.println();

        // Remove Remaining Element
        System.out.println(
                "Removed Element: " + q.pop());

        // Queue Empty Case
        System.out.println(
                "Removed Element: " + q.pop());

        System.out.println();

        // Final Check
        System.out.println(
                "Is Queue Empty? " + q.isEmpty());
    }
}