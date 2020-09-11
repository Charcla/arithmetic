package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {
	List<Integer> list=new ArrayList<>();
	public List<Integer> inorderTraversal(TreeNode root) {
//        Stack<TreeNode> s=new Stack<>();
//        List<Integer> list=new ArrayList<>();
//        while(root!=null||!s.isEmpty()){
//        	if(root!=null){
//        		s.push(root);
//        		root=root.left;
//        	}else{
//        		root=s.pop();
//        		list.add(root.val);
//        		root=root.right;
//        	}
//        }
//        return list;
		
		if(root!=null){
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);
		}
		return list;
    }
}
