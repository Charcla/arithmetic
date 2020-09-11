package swordOffer;

import java.util.Arrays;

public class test4 {
	
	
	/*
	 * 链接：https://www.nowcoder.com/questionTerminal/8a19cbe657394eeaac2f6ea9b0f6fcf6
	 */

	/*
	 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
	 */
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		int i=0,j=0;
		TreeNode root;
		
		//�ж������Ƿ�Ϊ��
		if(pre.length!=0){
			root=new TreeNode(pre[i]);
		}else{
			root=null;
		}
		if(root!=null){
			//�ҵ����ڵ�
			while(in[j]!=pre[i]){
				j++;
			}			
			root.left=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, j+1),Arrays.copyOfRange(in, i, j));
			root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, j+1, pre.length), Arrays.copyOfRange(in, j+1, in.length));
		}

		return root;
        
    }
	
	public static void pre(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			pre(root.left);
			pre(root.right);
		}
	}
	
	public static void last(TreeNode root){
		if(root!=null){
			last(root.left);
			last(root.right);
			System.out.println(root.val);
		}
	}
	
	public static void main(String[] args) {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		
//		int[] qq={4,7};
//		int[] lll=Arrays.copyOfRange(qq, 1, 1);
//		for(int i=0;i<lll.length;i++){
//			System.out.println(lll[i]);
//		}
//		
//		int[] a={};
//		System.out.println(a.length);
//		//TreeNode root=new TreeNode(a[0]);
//		//System.out.println(root==null);
		
		TreeNode root=reConstructBinaryTree(pre,in);
		last(root);
	}

}
