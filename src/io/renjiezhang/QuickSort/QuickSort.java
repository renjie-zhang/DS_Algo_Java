package io.renjiezhang.QuickSort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: renjie.zhang
 * @date:2019/9/15-18:31
 * @Description: 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }

        System.out.println("");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前" + date1Str);

        sort(arr,0,arr.length-1);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序之后" + date2Str);
    }

    private static void sort(Comparable[] a, int low,int high){
        if(high<low) return;
        int j = partition(a,low,high);
        //向左递归
        sort(a,low,j-1);
        //向右递归
        sort(a,j+1,high);
    }
    //快速切分
    private static int partition(Comparable[] a,int low,int high){
        int i = low,j = high+1;
        //切分元素
        Comparable v = a[low];
        while (true){
            while (less(a[++i],v)) if (i == high) break;
            while (less(v,a[--j])) if(j==low) break;
            if (i >= j) break;
            exchange(a,i,j);
        }
        exchange(a,low,j);
        return j;
    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exchange(Object[] a,int i,int j){
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static boolean isSorted(Comparable[] a){
        for(int i= 0 ;i<a.length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }

    private static boolean isHsorted(Comparable[] a,int h){
        for(int i = 0;i<a.length;i++){
            if(less(a[i],a[h])) return false;
        }
        return true;
    }

    private static void show(Comparable[] a){
        for(int i =0 ;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
