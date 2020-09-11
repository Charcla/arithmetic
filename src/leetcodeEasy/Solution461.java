package leetcodeEasy;

public class Solution461 {
	public int hammingDistance(int x, int y) {
        int n=x^y;
        int count=0;
        while(n!=0){
        	count++;
        	n=n&(n-1);
        }
        return count;
    }
}
