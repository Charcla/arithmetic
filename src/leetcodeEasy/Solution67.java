package leetcodeEasy;

/**
 * Created by skyou on 2019/5/23.
 */
public class Solution67 {

    public String addBinary(String a, String b) {
        int m=a.length()-1,n=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        while(carry==1||m>=0||n>=0){
            if(m>=0&&a.charAt(m--)=='1') carry++;
            if(n>=0&&b.charAt(n--)=='1') carry++;
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
