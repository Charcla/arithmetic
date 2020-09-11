package leetcodeEasy;

import java.util.Stack;

/**
 * Created by skyou on 2019/5/24.
 */
public class MyQueue {

    Stack<Integer> s;
    Stack<Integer> s1;
    /** Initialize your data structure here. */
    public MyQueue() {
        s=new Stack<>();
        s1=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return s1.pop();
    }

    /** Get the front element. */
    public int peek() {
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }

}

