package leetcodeEasy;

public class Solution235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode res=find(root,p,q);
		return res;      
    }
	
	public TreeNode find(TreeNode root,TreeNode p,TreeNode q){
		if((root.val-p.val)*(root.val-q.val)<=0){
			return root;
		}else if(root.val<q.val){
			return find(root.right,p,q);
		}else{
			return find(root.left,p,q);
		}		
	}
}
