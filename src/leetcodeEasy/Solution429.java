package leetcodeEasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by skyou on 2019/6/6.
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret=new LinkedList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root==null)
            return ret;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> curLevel=new LinkedList<>();
            int len=queue.size();
            for(int i=0;i<len;i++){
                Node cur=queue.poll();
                curLevel.add(cur.val);
                for(Node c:cur.children)
                    queue.offer(c);
            }
            ret.add(curLevel);
        }
        return ret;
    }
}
