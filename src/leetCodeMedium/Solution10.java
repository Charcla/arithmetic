package leetCodeMedium;

public class Solution10 {
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree2(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
	public static TreeNode buildTree2(int[] inorder,int begin1,int end1, int[] postorder,int begin2,int end2) {
		TreeNode root=null;
		int length=1;
		if(end2-begin2>=0){
			root=new TreeNode(end2);
		}
		for(int i=end1;i>=begin1;i--){
			if(inorder[i]==postorder[end2])
				break;
			length++;
		}
		if(root!=null){
			root.left=buildTree2(inorder, begin1, end1-length, postorder, begin2, end2-length);
			root.right=buildTree2(inorder, end1-length+2, end1, postorder, end2-length+2, end2);
		}
		return root;
	}
	public static void main(String[] args) {
//		int[] preorder={3,5,6,2,7,4,1,0,8};
//		int[] inorder={6,5,7,2,4,3,0,1,8};
		int[] preorder={9,3,15,20,7};
		int[] inorder={9,15,7,20,3};
		buildTree(preorder, inorder);
	}
	
}
