package leetcodeEasy;

public class Solution572 {
	// ±º‰∏¥‘”∂»n*m
	public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
        	return false;
        }
        return isSameTree(s, t)||isSubtree(s.left, t)||isSubtree(s.right, t);
    }
	
	public boolean isSameTree(TreeNode s,TreeNode t){
		if(s!=null&&t!=null){
			return s.val==t.val&&isSameTree(s.left, t.left)&&isSameTree(s.right, t.right);
		}else if(s==null && t==null){
			return true;
		}else{
			return false;
		}
	}
}
