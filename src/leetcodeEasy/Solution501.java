package leetcodeEasy;

import java.util.List;

/**
 * Created by skyou on 2019/6/1.
 */
public class Solution501 {
    public int[] findMode(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode cur=root;
        TreeNode mostRight=null;
        while(cur!=null){
            mostRight=cur.left;
            if(mostRight!=null){
                while(mostRight!=null&&mostRight.right!=cur){
                    mostRight=mostRight.right;
                }
                if(mostRight.right==null){
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }else {
                    mostRight.right=null;
                }
                cur=cur.right;
            }

        }
        return new int[0];
    }
}
