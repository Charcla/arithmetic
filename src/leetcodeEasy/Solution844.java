package leetcodeEasy;

import java.util.Stack;

/**
 * @author Charcl
 * @date 2020/3/27 11:03
 */
public class Solution844 {

    public boolean backspaceCompare(String S, String T) {
        //return build(S).equals(build(T));
        int i=S.length()-1,j=T.length()-1;
        int skipS=0,skipT=0;
        while(i>=0||j>=0){
            while (i>=0){
                if(S.charAt(i)=='#'){
                    skipS++;i--;
                }else if(skipS>0){
                    skipS--;i--;
                }else {
                    break;
                }
            }
            while (j>=0){
                if(T.charAt(j)=='#'){
                    skipT++;j--;
                }else if(skipT>0){
                    skipT--;j--;
                }else {
                    break;
                }
            }
            if(i>=0&&j>=0&&S.charAt(i)!=T.charAt(j)){
                return false;
            }
            if((i>=0)!=(j>=0)){
                return false;
            }
            i--;j--;
        }
        return true;
    }

    //时间0(m+n),空间0(m+n)
    /*public String build(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }else if (!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }*/

}
