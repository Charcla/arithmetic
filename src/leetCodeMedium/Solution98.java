package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution98 {
	public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        List<Integer> list=new ArrayList<>();
        while(root!=null||!s.isEmpty()){
        	if(root!=null){
        		s.push(root);
        		root=root.left;
        	}else{
        		root=s.pop();
        		list.add(root.val);
        		root=root.right;
        	}
        }
        for(int i=0;i<list.size()-1;i++)
        	if(list.get(i)>list.get(i+1))
        		return false;
        return true;
    }
}
