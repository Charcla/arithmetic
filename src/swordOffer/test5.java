package swordOffer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * stack1用来入栈，stack2用来出栈，当需要出栈时把stack1数组全部放入stack2,结束后再放回stack1
 * @author skyou
 *
 */
public class test5 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	int pop=stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return pop;
    }

}
