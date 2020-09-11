package swordOffer;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author skyou
 *
 */
public class test17 {
	
	public void Mirror(TreeNode root) {
		TreeNode temp=root;
        if(root!=null){
        	temp=root.left;
        	root.left=root.right;
        	root.right=temp;  
        	if(root.left!=null){
        		Mirror(root.left);
        	}
        	if(root.right!=null){
        		Mirror(root.right);
        	}
        }
    }

}
