package classic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 桶排序，最好情况下，每个桶只有一个数据，时间复杂度O(n)
 * 如果分布并不均匀，比如10个桶，10个数据，一个桶就占用了9个数据，
 * 那么时间复杂度就下降到0(n*logn)
 * Created by skyou on 2019/6/15.
 */
public class BucketSort {

    public static void bucketSort(int[] arr){
        if(arr==null||arr.length==0||arr.length==1){
            return;
        }
        int min=arr[0],max=arr[0];
        int length=arr.length;
        for(int n:arr){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }

        //计算差值
        int diff=max-min;

        //默认桶的数量为原数组的长度
//        List<List<Integer>> bucketList=new ArrayList<>();
        List<Integer>[] bucket=new List[length];
        for(int i=0;i<length;i++){
            bucket[i]=new ArrayList<>();
        }
        //每个桶的存数区间
        float section = (float) diff / (float) (length - 1);

        //数据入桶
        for(int n:arr){
            //当前数除以区间得出存放桶的位置 减1后得出桶的下标
            int num = (int) (n / section) - 1;
            num=num<0?0:num;
            bucket[num].add(n);
        }

        //桶内排序
        for(int i=0;i<bucket.length;i++){
            Collections.sort(bucket[i]);
        }

        //写入原数组
        int index = 0;
        for(List<Integer> arrayList : bucket){
            for(int value : arrayList){
                arr[index] = value;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] num={500,6123,1700,10,9999};
        bucketSort(num);
        for(int n:num){
            System.out.println(n);
        }
    }
}
