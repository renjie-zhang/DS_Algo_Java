package io.renjiezhang.ShellSort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: renjie.zhang
 * @date:2019/9/12-22:18
 * @Description: 希尔排序
 */
public class ShellSort {
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
    public static void sort(Comparable[] a){
        int n = a.length;
        int h = 1;
        while (h<n/3){
            h = 3*h+1;
        }
        while (h >= 1){
            for (int i =h;i<n;i++){
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
                    exchange(a,j,j-h);
                }
            }
            assert isHsorted(a,h);
            h /=3;
        }
        assert isSorted(a);
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
