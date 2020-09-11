package leetcodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    Stack<Integer> s;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
    }

    public void push(int x) {
        if(x<=min){
            s.push(min);
            min=x;
        }
        s.push(x);
    }

    public void pop() {
        if(s.pop() == min) min=s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(6);
        minStack.getMin();  //--> 返回 -3.
        minStack.pop();
        minStack.top();      //--> 返回 0.
        minStack.getMin();   //--> 返回 -2.
    }
}
