package io.renjiezhang.HeapSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author: renjie.zhang
 * @date:2019/9/25-22:14
 * @Description: 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }

        System.out.println("");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前" + date1Str);

        heapSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序之后" + date2Str);
    }

    private static void heapSort(int array[]){

        for(int i=array.length/2-1;i>=0;i--){
            changeToBigHeap(array,i,array.length);
        }
        int temp;
        for(int i = array.length-1;i>0;i--){
            temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            changeToBigHeap(array,0,i);
        }
    }

    /**
     *  第一个非叶子节点为
     *  完成对i对应的非叶子节点的树调整成大顶堆
     *  举例 int arr[] = {4,6,8,5,9} =>i = 1 --->调用方法之后{4，9，8，5，6}
     * @param array 待调整的数组
     * @param i  表示非叶子结点在数组中索引
     * @param length 表示对多少个元素继续调整，length是一个逐渐减少的
     */
    private static void changeToBigHeap(int array[],int i,int length){
        //保存当前元素的值
        int temp = array[i];
        //1 k = i*2+1 k是i结点的左子节点--->当for循环结束后，那么最大值在最顶端
        for(int k = i*2+1;k<length;k = k*2+1){
            if(k+1 <length && array[k]<array[k+1]){
                k++;
            }
            if(array[k]>temp){
                array[i] = array[k];
                i = k;
            }else{
                break;
            }
        }
        array[i] = temp;
    }
}
