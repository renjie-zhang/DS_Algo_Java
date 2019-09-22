package io.renjiezhang.InsertValueFind;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: renjie.zhang
 * @date:2019/9/22-18:25
 * @Description: 插值查找
 */
public class InsertValueFind {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i=0;i<100;i++){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
        int i = insertValueFind(array, 0, array.length - 1, 58);
        System.out.printf("找到的下标为%d\n",i);
    }

    private static int insertValueFind(int[] arr,int left,int right,int findValue){
        if(left>right||findValue<arr[0]||findValue>arr[arr.length-1]){
            return -1;
        }
        //插值公式计算mid
        int  mid = left+(right-left)*(findValue-arr[left])/(arr[right]-arr[left]);
        if(findValue<arr[mid]){
            insertValueFind(arr,left,mid-1,findValue);
        }
        else if(findValue>arr[mid]){
            insertValueFind(arr,mid+1,right,findValue);
        }else {
            return mid;
        }
        return -1;
    }

}
