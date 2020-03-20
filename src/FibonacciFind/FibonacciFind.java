package io.renjiezhang.FibonacciFind;

import java.util.Arrays;

/**
 * @author: renjie.zhang
 * @date:2019/9/22-19:31
 * @Description: 斐波那契查找
 * mid = low F(k-1)-1
 */
public class FibonacciFind {

    private static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {12,14,35,56,67,334,456};
        System.out.printf("查找值的下标是%d\n",FibonacciFind(arr,35));
    }
    private static int FibonacciFind(int[] array,int findValue){
        int low = 0;
        int high = array.length-1;
        //表示斐波那契分割数值的下标
        int k =0;
        int mid = 0;
        //获取斐波那契数列
        int f[] = Fib();
        while (high>f[k] -1){
            k++;
        }
        int[] temp = Arrays.copyOf(array,f[k]);
        for (int i = high+1;i<temp.length;i++){
            temp[i] = array[high];
        }
        while (low<high){
            mid = low+f[k-1]-1;
            if(findValue<temp[mid]){
                //向数组的左边进行查找
                high = mid-1;
                k--;
            }
            else if(findValue>temp[mid]){
                low = mid+1;
                k-=2;
            }else{
                if(mid<high){
                    return mid;
                }else {
                    return high;
                }
            }
        }
        return -1;
    }

    /**
     * 生成斐波那契数组
     * @return
     */
    private static int[] Fib(){
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for(int i =2;i<maxSize;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f;
    }
}
