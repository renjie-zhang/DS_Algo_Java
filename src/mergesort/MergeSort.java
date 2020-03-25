package mergesort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MergeSort {
    private static Comparable[] aux;
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
        aux = new Comparable[arr.length];
        sort(arr,0,arr.length-1);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序之后" + date2Str);
    }
    private static void sort(Comparable[] a,int low,int high){
        if(high<=low) return;
        int mid = low+(high-low)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    private static void merge(Comparable[] a,int low,int mid,int high){
        int i=low,j=mid+1;
        for(int k=low;k<=high;k++)
            aux[k]=a[k];
        for(int k=low;k<=high;k++)
            if(i>mid) a[k]=aux[j++];
            else if (j>high) a[k]=aux[i++];
            else if (less(aux[j],aux[i])) a[k]=aux[j++];
            else a[k]=aux[i++];
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
