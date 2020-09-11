package leetCodeMedium;

import java.util.LinkedList;

/**
 * @author Charcl
 * @date 2019/7/30 17:50
 */
public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> s=new LinkedList<>();
        for(int i=0;i< asteroids.length;i++){
            if(asteroids[i]>0||s.isEmpty()||s.getLast()<0){
                s.add(asteroids[i]);
            }else if(s.getLast()<=-asteroids[i]){
                if(s.pollLast()<-asteroids[i]){
                    i--;
                }
            }
        }
        int[] res=new int[s.size()];
        for (int i=0;i<res.length;i++){
            res[i]=s.get(i);
        }
        return res;
//        return s.stream().mapToInt(i->i).toArray();
    }
}
