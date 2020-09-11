package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/8/17 10:53
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int[] s=new int[flowerbed.length+2];
//        s[0]=0;
//        s[s.length-1]=0;
//        for(int i=0;i<flowerbed.length;i++){
//            s[i+1]=flowerbed[i];
//        }
//        for(int i=1;i<s.length-1;i++){
//            if(s[i-1]==0 && s[i]==0 && s[i+1]==0){
//                s[i]=1;
//                n-=1;
//            }
//        }
//        return n<=0;
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                n-=1;
            }
        }
        return n<=0;
    }
}

