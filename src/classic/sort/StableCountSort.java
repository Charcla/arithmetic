package classic.sort;

/**
 * 稳定计数排序
 * Created by skyou on 2019/6/15.
 */
public class StableCountSort {

    public static void stableCountSort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        int max=arr[0];
        for(int n:arr){
            max=Math.max(n,max);
        }
        //初始化计数数组
        int[] countArr=new int[max+1];

        //计数
        for(int n:arr){
            countArr[n]++;
        }

        //顺序累加
        for(int i=1;i<max+1;i++){
            countArr[i]=countArr[i-1]+countArr[i];
        }

        //排序后的数组
        int[] sortedArr=new int[arr.length];

        //排序
        for(int i=arr.length-1;i>=0;i--){
            sortedArr[countArr[arr[i]]-1]=arr[i];
            countArr[arr[i]]--;
        }

        for(int i=0;i<arr.length;i++)
            arr[i]=sortedArr[i];
    }

    /*public static void stableCountSort2(String[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        int max=Integer.valueOf(arr[0].split("_")[0]);
        for(String n:arr){
            max=Math.max(Integer.valueOf(n.split("_")[0]),max);
        }
        //初始化计数数组
        int[] countArr=new int[max+1];

        //计数
        for(String n:arr){
            countArr[Integer.valueOf(n.split("_")[0])]++;
        }

        //顺序累加
        for(int i=1;i<max+1;i++){
            countArr[i]=countArr[i-1]+countArr[i];
        }

        //排序后的数组
        int[] sortedArr=new int[arr.length];

        //排序
        for(int i=arr.length-1;i>=0;i--){
            sortedArr[countArr[arr[i]]-1]=arr[i];
            countArr[arr[i]]--;
        }

        for(int i=0;i<arr.length;i++)
            arr[i]=sortedArr[i];
    }*/

    public static void main(String[] args) {
        int[] num={3,5,8,2,5,4};
        stableCountSort(num);
        for(int n:num)
            System.out.println(n);
    }

}
