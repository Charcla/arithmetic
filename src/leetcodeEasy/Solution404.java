package leetcodeEasy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Charcl
 * @date 2019/8/19 19:26
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        if(root.left==null){  //左子树为空
//            return sumOfLeftLeaves(root.right);
//        }
//        if(root.left.left==null&&root.left.right==null){    //左子树只剩下最后一个叶子节点
//            return sumOfLeftLeaves(root.right)+root.left.val;
//        }
//        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

        //非递归
        int sum=0;
        if(root==null||root.left==null&&root.right==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left!=null){
                if(temp.left.left==null&&temp.left.right==null){
                    sum+=temp.left.val;
                }
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
        return sum;
    }
}
