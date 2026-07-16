package Java.String;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> st = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                cnt++;
                st.push(ch);
                maxDepth = Math.max(maxDepth, cnt);
            }
            else if (ch == ')') {
                cnt--;
                st.pop();
            }
        }
        return maxDepth;
    }

}
