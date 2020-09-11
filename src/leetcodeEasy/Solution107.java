package leetcodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by skyou on 2019/5/18.
 */
public class Solution107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>(); //队列存储中间节点
        LinkedList<List<Integer>> res=new LinkedList<>();//返回结果结果
        List<Integer> list=new ArrayList<>();
        TreeNode last=root,nlast=root;//last表示当前行的最后一个节点，nlast表示下一行的最后节点
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();  //取出队列首节点
            if(cur.left!=null){
                queue.add(cur.left); //每次访问孩子，豆浆nlast指向
                nlast=cur.left;
            }
            if(cur.right!=null){
                queue.add(cur.right);
                nlast=cur.right;
            }
            list.add(cur.val); //层集合加入当前节点
            if(cur==last){  //如果到了尾节点说明当前行已经访问完了
                res.addFirst(list);
                last=nlast;
                list=new ArrayList<>();
            }
        }

        return res;
    }
}
