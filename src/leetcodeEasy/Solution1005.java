package leetcodeEasy;

import java.util.PriorityQueue;

/**
 * Created by skyou on 2019/5/23.
 */
public class Solution1005 {

    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:A){
            pq.add(n);
        }
        while(K-->0){
            pq.add(-pq.poll());
        }
        int sum=0;
        for(int i=0;i<A.length;i++)
            sum+=pq.poll();
        return sum;
    }
}
