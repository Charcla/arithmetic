package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0){
        	return list;
        }
        list.add(new ArrayList<Integer>());
        list.get(0).add(1);
        List<Integer> row;
		for(int i=1;i<numRows;i++){
			row=new ArrayList<>();
			row.add(1);
			List<Integer> preList=list.get(i-1);
        	for(int j=1;j<i;j++){
        		row.add(preList.get(j-1)+preList.get(j));
        	}
        	row.add(1);
        	list.add(row);
        }
		return list;
    }
	public static void main(String[] args) {
		generate(5);
	}
}
