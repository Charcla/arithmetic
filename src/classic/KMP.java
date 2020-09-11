package classic;

import java.util.HashMap;
import java.util.Map;

public class KMP {
	public static void getNext(char[] arr,int[] next){
		next[0]=-1;
		int i=0,j=-1;
		while(i<arr.length-1){
			if(j==-1||arr[i]==arr[j]){
				i++;
				j++;
				next[i]=j;
			}else{
				j=next[j];
			}
		}
	}
	public static void main(String[] args) {
		char[] arr={'a','b','a','b','a','b','c','a'};
		int[] next=new int[arr.length];
		getNext(arr,next);
		for(int i:next){
			System.out.println(i);
		}
		Map<Integer,Integer> map=new HashMap();
	}
}
