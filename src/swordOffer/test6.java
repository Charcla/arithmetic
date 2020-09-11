package swordOffer;

public class test6 {

	public static int minNumberInRotateArray(int [] array) {
	    int i=0,num=array.length;
	    if(num==0){
	    	return 0;
	    }else{
	    	while(array[i]<array[i+1]&&i<array.length-2){
		    	i++;
		    }
		    return array[i+1];
	    }
    }
	
	public static void main(String[] args) {
		
		int[] array={3,4,5,1,2,3};
		System.out.println(minNumberInRotateArray(array));
	}
}
