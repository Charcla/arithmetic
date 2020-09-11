package swordOffer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author skyou
 *
 */
public class test19 {
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list=new ArrayList<>();
		int row=matrix.length;
		int colunms=matrix[0].length;
		int n=0,m=colunms-1;
		int row1=row,col1=colunms;
		int k=0;
		while(row*colunms>list.size()){
			if(row1==1){
				for(int i=k;i<=colunms-k*2;i++){
					list.add(matrix[k][i]);
				}
			}else if(col1==1){
				for(int i=k;i<=row-k*2;i++){
					list.add(matrix[i][k]);
				}
			}else{
				//�������
				for(int j=n;j<m;j++){
					list.add(matrix[n][j]);
				}
				//�ϵ������
				for(int j=n;j<row-n;j++){
					list.add(matrix[j][m]);
				}
				//�ҵ������
				for(int j=m-1;j>n;j--){
					list.add(matrix[row-1-n][j]);
				}
				//�µ���
				for(int j=row-1-n;j>n;j--){
					list.add(matrix[j][colunms-1-m]);
				}
				n++;
				m--;
				row1-=2;
				col1-=2;
				k++;
			}
		}
		
		
		for(Integer list1:list){
			System.out.println(list1);
		}
		
		return list;	       
    }
	
	public static void main(String[] args) {
		int[][] matrix={{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}};
		printMatrix(matrix);
//		for(int i=-1;i<5&&i>0;i++){
//			System.out.println(i);
//		}
	}

}
