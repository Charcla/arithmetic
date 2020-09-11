package leetCodeMedium;

import java.util.Arrays;

public class Solution105 {
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
//		TreeNode root=null;
//		if(preorder.length!=0)
//			root=new TreeNode(preorder[0]);
//		int index=0;
//		for(int i=0;i<inorder.length;i++){
//			if(inorder[i]==preorder[0]){
//				index=i;
//				break;
//			}
//		}
//		if(root!=null){
//			root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
//			root.right=buildTree(Arrays.copyOfRange(preorder, index+1,preorder.length),Arrays.copyOfRange(inorder, index+1,inorder.length));
//		}	
//		return root;		
		return buildTree2(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
	public static TreeNode buildTree2(int[] preorder,int begin1,int end1, int[] inorder,int begin2,int end2) {
		TreeNode root=null;
		int length=0;
		if(end1-begin1>=0)
			root=new TreeNode(preorder[begin1]);
		int index=begin2;
		for(int i=begin2;i<=end2;i++){
			if(inorder[i]==preorder[begin1]){
				index=i;
				length=index-begin2;
				break;
			}
		}
		if(root!=null){
			root.left=buildTree2(preorder,begin1+1,length+begin1,inorder,begin2,begin2+length-1);
			root.right=buildTree2(preorder,length+begin1+1,end1,inorder,begin2+length+1,end2);
		}	
		return root;
	}
	public static void main(String[] args) {
//		int[] preorder={3,5,6,2,7,4,1,0,8};
//		int[] inorder={6,5,7,2,4,3,0,1,8};
		int[] preorder={3,9,20,15,7};
		int[] inorder={9,3,15,20,7};
		buildTree(preorder, inorder);
	}
}