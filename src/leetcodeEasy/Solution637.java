package leetcodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by skyou on 2019/5/18.
 */
public class Solution637 {

    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>(); //队列存储中间节点
        LinkedList<Double> res=new LinkedList<>();//返回结果结果
        double sum=0;int count=0;  //sum表示层次元素的和，count表示层次元素的个数
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
            sum+=cur.val; //层集合加入当前节点
            count++;
            if(cur==last){  //如果到了尾节点说明当前行已经访问完了
                res.add(sum/count);
                last=nlast;
                sum=0;
                count=0;
            }
        }
        return res;
    }
}
