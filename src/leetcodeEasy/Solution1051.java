package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/7/24 20:34
 */
public class Solution1051 {

    public int heightChecker(int[] heights) {
        int[] arr=new int[101];
        for(int h:heights){
            arr[h]++;
        }
        int count=0;
        for(int i=1,j=0;i<arr.length;i++){
            while(arr[i]-->0){
                if(heights[j++]!=i)
                    count++;
            }
        }
        return count;
    }
}
