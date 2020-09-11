package swordOffer;

public class test1 {

	//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	
	public static boolean Find(int target, int [][] array) {
		int rows=array.length;
		int columns=array[0].length;
		int i=0,j=columns-1;
		while(i<rows&&j>=0){
			if(array[i][j]>target){
                j--;
                continue;
            }else if(array[i][j]<target){
                i++;
                continue;
            }else{
                return true;
            }
			
		}			
		return false;

	}
	
	
	public static void main(String[] args) {
		
		int array[][] ={{ 1, 2, 8, 9 },
			      		{ 2, 4, 8, 12 },
			      		{ 4, 7, 10, 13 },
			      		{ 6, 8, 11, 15 } };
		System.out.println(Find(5,array));
		
	}

}
