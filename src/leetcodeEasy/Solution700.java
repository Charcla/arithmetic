package leetcodeEasy;

/**
 * Created by skyou on 2019/5/18.
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root!=null){
            if(root.val==val){
                return root;
            }else if(root.val>val){
                return searchBST(root.left,val);
            }else{
                return searchBST(root.right,val);
            }
        }
        return null;
    }
}
