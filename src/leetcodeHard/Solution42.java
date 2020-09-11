package leetcodeHard;

public class Solution42 {
	public int trap(int[] height) {
		//left[i]表示i位置的节点的左边的最大值
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        for(int i=1;i<height.length;i++){
        	left[i]=Math.max(left[i-1],height[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
        	right[i]=Math.max(right[i+1],height[i+1]);
        }
        int res=0,level=0;
        for(int i=0;i<height.length;i++){
        	level=Math.min(left[i], right[i]);
        	res=res+Math.max(0,level-height[i]);
        }
        return res;
    }
}
