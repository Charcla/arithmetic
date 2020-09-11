package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/8/8 11:34
 */
public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }
        //合并根节点
        TreeNode root=new TreeNode((t1==null?0:t1.val)+(t2==null?0:t2.val));
        //再递归合并左右子树
        root.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return root;
    }

    public TreeNode mergeTrees_1(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        // 先合并根节点
        t1.val += t2.val;
        // 再递归合并左右子树
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
