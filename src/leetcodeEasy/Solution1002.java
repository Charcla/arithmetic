package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution1002 {
    //建立一个二维数组，行数是输入单词的个数（最大100），列数是26个英文字母。
    public static List<String> commonChars(String[] A) {
        int[][] n=new int[A.length][26];
        List<String> res=new ArrayList<>();
        //将值放进对应的二维数组
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                n[i][A[i].charAt(j)-'a']++;
            }
        }

        //求交集
        for(int j=0;j<26;j++){
            for(int i=0;i<A.length-1;i++){
                n[0][j]=Math.min(n[0][j],n[i+1][j]);
            }
            while (n[0][j]!=0){
                res.add(String.valueOf((char)('a'+j)));
                n[0][j]--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] A={"bella","label","roller"};
        commonChars(A);
    }
}
