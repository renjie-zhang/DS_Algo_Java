package io.renjiezhang.SelectSort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: renjie.zhang
 * @date:2019/9/15-14:19
 * @Description: 选择排序
 */
public class SelectSort {

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

        sort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序之后" + date2Str);
    }

    private static void sort(Comparable[] a){
        for(int i=0;i<a.length;i++){
            //记录最小值的下标
            int minValue = i;
            for (int j = i+1;j<a.length;j++){
                if(less(a[j],a[minValue])){
                    //如果当前下标的值小于标记的下标，那么将进行exchange
                    minValue = j;
                }
            }
            //进行交换
            exchange(a,i,minValue);
        }
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
