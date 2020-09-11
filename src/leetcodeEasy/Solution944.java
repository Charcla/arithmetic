package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution944 {
	public int minDeletionSize(String[] A) {
		List<Integer> list=new ArrayList<>();
		boolean flag=true;
		for(int i=0;i<A[0].length();i++){
			for(int j=0;j<A.length-1;j++){
				if(A[j].charAt(i)<A[j+1].charAt(i)){					
					flag=false;
				}		
			}
			if(flag)
				list.add(1);
		}
		return list.size();
    }
}
