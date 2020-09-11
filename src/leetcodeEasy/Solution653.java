package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Charcl
 * @date 2020/3/25 14:56
 */
public class Solution653 {

    public boolean findTarget(TreeNode root, int k) {

        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int lo=0,hi=list.size()-1;
        while (lo<hi){
            int sum=list.get(lo)+list.get(hi);
            if(sum==k){
                return true;
            }else if(sum<k){
                lo++;
            }else {
                hi--;
            }
        }
        return false;
    }

    //中序遍历
    public void inorder(TreeNode root,List list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

}
