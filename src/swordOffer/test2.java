package swordOffer;

public class test2 {

	//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	public static String replaceSpace(StringBuffer str) {
		
		int index=str.indexOf(" ");
		while(index!=-1){
			str.replace(index, index+1, "%20");
			index=str.indexOf(" ",index);
		}
		String result=str.toString();
		return result;
    	
    }
	
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("We Are Happy");
		String s=replaceSpace(str);
		System.out.println(s);
	}

}
