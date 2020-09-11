package leetcodeEasy;

import java.util.Stack;

public class Solution682 {
	public static int calPoints(String[] ops) {
		Stack<Integer> stack=new Stack<>();
		for(String s:ops){
			if(s.equals("+")){
				int n1=stack.pop();
				int n2=stack.pop();
				stack.push(n2);
				stack.push(n1);
				stack.push(n1+n2);
			}else if(s.equals("D")){
				stack.push(stack.peek()*2);
			}else if(s.equals("C")){
				stack.pop();
			}else{
				stack.push(Integer.valueOf(s));
			}
		}
		int sum=0;
		while(!stack.isEmpty()){
			sum+=stack.pop();
		}
		return sum;
    }
	public static void main(String[] args) {
		String[] ops={"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));
	}
	
	
}
