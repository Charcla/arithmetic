package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyou on 2019/5/27.
 */
public class Solution530 {

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        getList(root,list);
        int i=0,j=1,min=Integer.MAX_VALUE;
        while(j<list.size()){
            min=Math.min(list.get(j++)-list.get(i++),min);
        }
        return min;
    }

    private static void getList(TreeNode root,List<Integer> list){
        if(root!=null){
            getList(root.left,list);
            list.add(root.val);
            getList(root.right,list);
        }
    }

    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(2);

        node1.right=node2;node2.left=node3;

        System.out.println(getMinimumDifference(node1));
    }
}
