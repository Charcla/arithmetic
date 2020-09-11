package leetcodeEasy;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class Solution0101 {

    public boolean isUnique(String astr) {
//        int[] hash=new int[58];
//        for(int i=0;i<astr.length();i++){
//            if(hash[astr.charAt(i)-65]==1){
//                return false;
//            }else{
//                hash[astr.charAt(i)-65]++;
//            }
//        }
//        return true;
        //位运算的思路,一个全为0的数字，把26个英文字母分别对应这个int数字的右边26位
        int n=0;
        int move_bit=0;
        for(int i=0;i<astr.length();i++){
            move_bit=astr.charAt(i)-97;//计算需要移位的长度
            if((n&(1<<move_bit))!=0){
                return false;
            }else{
                n=n|(1<<move_bit);
            }
        }
        return true;
    }
}
