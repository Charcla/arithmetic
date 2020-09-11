package leetcodeHard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Solution145 {
	//方法1：递归，时间O(n),空间O(n)
	List<Integer> list=new ArrayList<>();
	public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
        	postorderTraversal(root.left);
        	postorderTraversal(root.right);
        	list.add(root.val);
        }
        return list;
    }
	
	//方法2：用栈实现非递归，时间O(n),空间O(n)
	public List<Integer> postorderTraversa2(TreeNode root) {
		LinkedList<Integer> list=new LinkedList<>();
        Stack<TreeNode> stack=new Stack();
        if(root==null)
        	return list;
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode cur=stack.pop();
        	list.addFirst(cur.val);
        	if(cur.left!=null)
        		stack.push(cur.left);
        	if(cur.right!=null)
        		stack.push(cur.right);
        }
        return list;
    }
	
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(7);
		
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t6;
		t4.right=t5;
		t6.left=t7;
		
		Solution145 s=new Solution145();
		s.postorderTraversa2(t1);
		
	}
	
}
