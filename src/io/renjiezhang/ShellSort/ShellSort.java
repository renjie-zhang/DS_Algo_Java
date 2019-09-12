package io.renjiezhang.ShellSort;

/**
 * @author: renjie.zhang
 * @date:2019/9/12-22:18
 * @Description: 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        String[] a = new String[]{"S" ,"O","R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(a);
        show(a);
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
