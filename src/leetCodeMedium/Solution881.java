package leetCodeMedium;

import java.util.Arrays;

/**
 * Created by skyou on 2019/5/21.
 */
public class Solution881 {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res=0;
        for(int i=people.length-1,left=0;i>=left;i--,res++){
            if(people[i]+people[left]<=limit)
                left++;
        }
        return res;
    }
}
