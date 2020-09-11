package swordOffer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author skyou
 *
 */
public class test16 {
	
	 public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		
		 boolean result=false;

		 //先查找A树中是否有B树的根节点
		 if(root1!=null&&root2!=null){
			 if(root1.val==root2.val){
				 result=isSubtree(root1, root2);
			 }
			 if(!result){
				 result=HasSubtree(root1.left, root2);
				 if(!result){
					 result=HasSubtree(root1.right, root2);
				 }
			 }
		 }
		 
		 return result;
	        
	 }
	 public static boolean isSubtree(TreeNode root1,TreeNode root2){
		 if(root1 == null && root2 != null) return false;
         if(root2 == null) return true;
         if(root1.val != root2.val) return false;
         return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
		 
	 }
	
	public static void main(String[] args) {
		
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		
		TreeNode node7=new TreeNode(2);
		TreeNode node8=new TreeNode(4);
		TreeNode node9=new TreeNode(5);
		
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node4.left=node6;
		
		node7.left=node8;
		node7.right=node9;
		
		System.out.println(HasSubtree(node1,node7));
		
	}

}
