package Java.String;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '('){
                if (st.isEmpty()){
                    st.push(ch);
                }else {
                    st.push(ch);
                    ans.append(ch);
                }
            }else {
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);
                }
            }
        }return ans.toString();
    }
}
