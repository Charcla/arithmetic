package swordOffer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author skyou
 *
 */
public class test23 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        int length=sequence.length;
        if(length==0){
        	return false;
        }
        return isTree(sequence,0,length-1);
    }
	
	public boolean isTree(int[] sequnnce,int left,int right){
		if(right<=left){
			return true;
		}
		int i=left;
		for(;i<right;i++){
			if(sequnnce[i]>sequnnce[right])
				break;
		}
		for(int j=i;j<right;j++){
			if(sequnnce[j]<sequnnce[right])
				return false;
		}
		
		return isTree(sequnnce, left, i-1)&&isTree(sequnnce, i, right-1);
	}
	
	public static void main(String[] args) {
		test23 t=new test23();
		int[] a={6,7,18,15,25,20};
		System.out.println(t.VerifySquenceOfBST(a));
	}
}
