package leetCodeMedium;

public class Solution106 {
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree2(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
	public static TreeNode buildTree2(int[] inorder,int begin1,int end1,int[] postorder,int begin2,int end2){
		TreeNode node=null;
		int length=0;
		if(end2-begin2>=0)
			node=new TreeNode(postorder[end2]);
		for(int i=end1;i>=begin1;i--){
			if(inorder[i]==postorder[end2]){
				break;
			}
			length++;
		}
		if(node!=null){
			node.right=buildTree2(inorder, end1-length+1, end1, postorder, end2-length, end2-1);
			node.left=buildTree2(inorder, begin1,end1-length-1, postorder, begin2, end2-length-1);
		}
		return node;
	}
	public static void main(String[] args) {
//		int[] preorder={3,5,6,2,7,4,1,0,8};
//		int[] inorder={6,5,7,2,4,3,0,1,8};
		int[] inorder={9,3,15,20,7};
		int[] postorder={9,15,7,20,3};
		buildTree(inorder, postorder);
	}
}
