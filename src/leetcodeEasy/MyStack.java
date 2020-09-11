package leetcodeEasy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by skyou on 2019/5/24.
 */
public class MyStack {

    Deque<Integer> deque;
    /** Initialize your data structure here. */
    public MyStack() {
        deque=new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        deque.addLast(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque.removeLast();
    }

    /** Get the top element. */
    public int top() {
        return deque.peekLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  deque.isEmpty();
    }
}
