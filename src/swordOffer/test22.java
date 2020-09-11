package swordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * @author skyou
 *
 */
public class test22 {

	//用了一个辅助栈
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList();
        if(root!=null){
        	q.add(root);
        	while(!q.isEmpty()){
        		TreeNode cur=q.remove();
        		list.add(cur.val);
        		if(cur.left!=null){
        			q.add(cur.left);
        		}
        		if(cur.right!=null){
        			q.add(cur.right);
        		}
        	}
        }
        return list;
        
    }

}
