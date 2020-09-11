package leetcodeEasy;

public class Solution236 {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
        	return root;
        }
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left==null&&right==null){
        	return null; //����������Ϊ�գ�p��q����������
        }else if(left!=null&&right!=null){
        	return root; //������������Ϊ�գ�
        }else return left==null?right:left;
        //������������ֵֻ��һ���գ�˵��p��q������������У������ҵ����Ǹ��ڵ�Ϊ����ֵ
    }
	public static void main(String[] args) {
		TreeNode[] node=new TreeNode[9];
		for(int i=0;i<9;i++)
			node[i]=new TreeNode(i);
		node[3].left=node[5];
		node[3].right=node[1];
		node[5].left=node[6];
		node[5].right=node[2];
		node[2].left=node[7];
		node[2].right=node[4];
		node[1].left=node[0];
		node[1].right=node[8];
		lowestCommonAncestor(node[3], node[6], node[1]);
	}
}
