package classic.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyou on 2019/6/15.
 */
public class BaseSort {
    public static void baseSort(int[] arr){
        if(arr==null||arr.length==0||arr.length==1){
            return;
        }
        int length = arr.length;
        int max=arr[0];
        for(int n:arr){
            max=Math.max(max,n);
        }
        //当前排序位置
        int location=1;

        List<Integer>[] bucket=new List[10];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<Integer>();
        }

        while(true){
            //判断是否排完
            int dd= (int) Math.pow(10,(location-1));
            if(max<dd){
                break;
            }

            //数据入桶
            for(int i=0;i<length;i++){
                //计算余数，放入相应的桶
                int num=(arr[i]/dd)%10;
                bucket[num].add(arr[i]);
            }

            //写回数组
            int nn = 0;
            for (int i=0;i<10;i++){
                int size = bucket[i].size();
                for(int ii = 0;ii < size;ii ++){
                    arr[nn++] = (int) bucket[i].get(ii);
                }
                bucket[i].clear();
            }
            location++;
        }
    }

    public static void main(String[] args) {
        int[] n={892, 846, 821, 199, 810,700,3,76};
        baseSort(n);
        for(int num:n){
            System.out.println(num);
        }
    }
}
