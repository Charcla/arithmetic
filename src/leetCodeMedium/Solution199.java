package leetCodeMedium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199 {
	public static List<Integer> rightSideView(TreeNode root) {
        if(root==null){
        	return new ArrayList<Integer>();
        }
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode t=new TreeNode(Integer.MIN_VALUE);
		TreeNode last=root; //表示当前行的最右边节点
		TreeNode nlast=root;//表示下一行的最右边节点
		queue.add(root);
		while(!queue.isEmpty()){
			t=queue.poll();
			if(t.left!=null){
				queue.add(t.left);
				nlast=t.left; //每加入一个节点，就将nlast变为那个节点
			}
			if((t.right!=null)){
				queue.add(t.right);
				nlast=t.right;
			}
			if(t==last){
				last=nlast;
				list.add(t.val);
			}	
		}
		return list;
    }
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		t1.left=t2;t1.right=t3;t2.right=t5;t3.right=t4;
		rightSideView(t1);
	}
}
