package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Solution95 {
	public List<TreeNode> generateTrees(int n) {
        TreeNode[] nodeList=new TreeNode[n+1];
        List<TreeNode> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        	nodeList[i]=new TreeNode(i);
        for(int i=1;i<=n;i++){
        	for(int j=0;j<i;j++){
        		
        	}
        }

        return list;
    }
}
