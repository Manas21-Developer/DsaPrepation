package Stack;

import java.util.Stack;

public class ImplementGetMinAndGetMax {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    // PUSH
    public void push(int val) {

        mainStack.push(val);

        // Min Stack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }

        // Max Stack
        if (maxStack.isEmpty() || val >= maxStack.peek()) {
            maxStack.push(val);
        }
    }

    // POP
    public int pop() {

        if (mainStack.isEmpty())
            return -1;

        int remove = mainStack.pop();

        // Remove from minStack
        if (remove == minStack.peek()) {
            minStack.pop();
        }

        // Remove from maxStack
        if (remove == maxStack.peek()) {
            maxStack.pop();
        }

        return remove;
    }

    // PEEK
    public int peek() {

        if (mainStack.isEmpty())
            return -1;

        return mainStack.peek();
    }

    // GET MIN
    public int getMin() {

        if (minStack.isEmpty())
            return -1;

        return minStack.peek();
    }

    // GET MAX
    public int getMax() {

        if (maxStack.isEmpty())
            return -1;

        return maxStack.peek();
    }

    // Driver Code
    public static void main(String[] args) {

        ImplementGetMinAndGetMax st =
                new ImplementGetMinAndGetMax();

        // Push Elements
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(1);

        System.out.println("Top Element: " + st.peek());

        System.out.println("Minimum Element: "
                + st.getMin());

        System.out.println("Maximum Element: "
                + st.getMax());

        System.out.println("Popped Element: "
                + st.pop());

        System.out.println("Minimum After Pop: "
                + st.getMin());

        System.out.println("Maximum After Pop: "
                + st.getMax());

        // Extra Edge Cases
        st.push(-3);

        System.out.println("New Min After -3 Push: "
                + st.getMin());

        st.push(10);

        System.out.println("New Max After 10 Push: "
                + st.getMax());

        System.out.println("Popped: " + st.pop());

        System.out.println("Current Max: "
                + st.getMax());
    }
}