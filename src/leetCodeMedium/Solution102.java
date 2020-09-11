package leetCodeMedium;

import java.util.*;

public class Solution102 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null)
			return new ArrayList<>();
		List<List<Integer>> list=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		TreeNode last=root;
		TreeNode nlast=root;
		TreeNode t=new TreeNode(Integer.MIN_VALUE);
		List<Integer> li=new ArrayList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			t=queue.poll();
			if(t.left!=null){
				queue.add(t.left);
				nlast=t.left;
			}
			if((t.right!=null)){
				queue.add(t.right);
				nlast=t.right;
			}
			li.add(t.val);
			if(t==last){
				list.add(li);
				last=nlast;
				li=new ArrayList<>();
			}	
		}
		return list;
    }

	public static List<List<Integer>> levelOrder2(TreeNode root) {
		List<List<Integer>> list=new ArrayList<>();
		if(root==null){
			return list;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()){
			int len=queue.size();
			List<Integer> curLevel=new ArrayList<>();
			for(int i=0;i<len;i++){
				TreeNode curNode=queue.poll();
				curLevel.add(curNode.val);
				if(curNode.left!=null)
					queue.offer(curNode.left);
				if(curNode.right!=null)
					queue.offer(curNode.right);
			}
			list.add(curLevel);
		}
		return list;
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		levelOrder(root);
	}
}
