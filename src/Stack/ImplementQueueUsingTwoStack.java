package Stack;

import java.util.SortedMap;
import java.util.Stack;

public class ImplementQueueUsingTwoStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int val){
        s1.push(val);
    }

    int pop(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }return s2.peek();
    }

    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingTwoStack Obj = new ImplementQueueUsingTwoStack();
        Obj.push(1);
        Obj.push(2);
        Obj.push(3);
        Obj.push(4);
        Obj.push(5);

        System.out.println(Obj.peek());// 1
        System.out.println(Obj.pop());// 1
        System.out.println(Obj.pop());//2
    }
}
