package leetCodeMedium;

/**
 * Created by skyou on 2019/5/18.
 */
public class Solution701 {
    //递归，时间O(logn)-O(n),空间O(logn)-O(n)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insertIntoBST(root.left,val);
        }else if(val>root.val){
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }

    //非递归，时间O(logn)-O(n),空间0(1)
    public static TreeNode insertIntoBST2(TreeNode root, int val) {
        TreeNode p=root;
        while(p!=null) {
            if (val > p.val) {  //在右边
                if (p.right == null) {
                    p.right = new TreeNode(val);  //直接插入
                    return root;
                } else {
                    p = p.right;  //接着在右边查找
                }
            } else if (val < p.val) {
                if (p.left == null) {
                    p.left = new TreeNode(val);
                    return root;
                } else {
                    p = p.left;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(40);
        TreeNode t2=new TreeNode(20);
        TreeNode t3=new TreeNode(60);
        TreeNode t4=new TreeNode(10);
        TreeNode t5=new TreeNode(30);
        TreeNode t6=new TreeNode(50);
        TreeNode t7=new TreeNode(70);
        t1.left=t2;t1.right=t3;;t2.left=t4;t2.right=t5;t3.left=t6;t3.right=t7;
        insertIntoBST2(t1,25);
    }

}
