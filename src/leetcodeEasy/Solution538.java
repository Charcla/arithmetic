package leetcodeEasy;

import java.util.Stack;

/**
 * @author Charcl
 * @date 2020/2/24 16:33
 */
public class Solution538 {

    private int sum=0;
    public TreeNode convertBST(TreeNode root){

        //1，递归，时间n,空间n
        /*if (root!=null){
            convertBST(root.right);
            sum+=root.val;
            root.val=sum;
            convertBST(root.left);
        }
        return root;*/

        //2，用栈，时间n，空间n
        Stack<TreeNode> stack=new Stack<>();
        int sum=0;
        TreeNode node=root;
        while (!stack.isEmpty()||node!=null){

            while (node!=null){
                stack.add(node);
                node=node.right;
            }

            node=stack.pop();
            sum+=node.val;
            node.val=sum;
            node=node.left;
        }
        return node;
    }

}
