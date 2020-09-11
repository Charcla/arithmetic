package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        List<Integer> list=new ArrayList<>();
        while(root!=null||!s.isEmpty()){
        	if(root!=null){
        		s.push(root);
        		list.add(root.val);
        		root=root.left;
        	}else{
        		root=s.pop();
        		root=root.right;
        	}
        }
        return list;
        
    }
}
