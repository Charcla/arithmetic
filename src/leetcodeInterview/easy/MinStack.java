package leetcodeInterview.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MinStack {
    //定义一个最小值，每次往栈放值的时候都和最小值比对，若小于最小值，则先将最下值放入，再放真实元素
    Deque<Integer> deque;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        deque=new ArrayDeque<>();
    }

    public void push(int x) {
        if(x<=min){
            deque.push(min);
            min=x;
        }
        deque.push(x);
    }

    public void pop() {
        if(deque.pop()==min)//因为push的时候多放了一个最小值，所以这里出栈的时候如果是最下值，就在if里面再pop一次，把多放的值也给弄出来
            min=deque.pop();//这个pop()操作返回的一定是现在栈的最小值，因为push操作先放最小值，再放真实元素
    }

    public int top() {
        return deque.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {

    }
}
