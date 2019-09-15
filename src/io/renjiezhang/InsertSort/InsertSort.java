package io.renjiezhang.InsertSort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: renjie.zhang
 * @date:2019/9/15-14:03
 * @Description: 插入排序
 */
public class InsertSort {

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

        //交换法
        for(int i = 1;i<a.length;i++){
            for(int j = i;j>0&&less(a[j],a[j-1]);j--){
                exchange(a,j,j-1);
            }
        }/*
        //移位法
        int insertValue = 0;
        int insertIndex = 0;
        for (int i = 1;i<a.length;i++){
            insertValue = Integer.valueOf(a[i].toString());
            insertIndex = i-1;
            while (insertIndex >=0 && insertValue<Integer.valueOf(a[insertIndex].toString())){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1 != i){
                a[insertIndex+1] = insertValue;
            }
        }*/
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
