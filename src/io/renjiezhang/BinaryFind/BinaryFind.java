package io.renjiezhang.BinaryFind;

import java.util.ArrayList;

/**
 * @author: renjie.zhang
 * @date:2019/9/22-16:16
 * @Description: 二分查找
 */
public class BinaryFind {
    public static void main(String[] args) {
        int[] array1 = new int[]{12,34,45,65,67,78,89};
        int i = BinaryFind(array1, 0, array1.length - 1, 65);
        System.out.printf("找到了元素索引值为%d\n",i);

        int[] array2 = new int[]{12,34,45,65,65,65,65,67,78,89};
        ArrayList<Integer> repeatEleByBinaryFind = getRepeatEleByBinaryFind(array2, 0, array2.length - 1, 65);
        System.out.println("多个目标值的下标为\n"+repeatEleByBinaryFind.toString());
    }

    /**
     * 二分查找
     * @param array 有序序列
     * @param left 序列的最左边
     * @param right 序列的最右边
     * @param findValue 查找的值
     * @return 值的下标
     */
    private static int BinaryFind(int[] array,int left,int right,int findValue){
        int mid = (left+right)/2;
        if(findValue<array[mid]){
            BinaryFind(array,left,mid-1,findValue);
        }
        else if(findValue>array[mid]){
            BinaryFind(array,mid+1,right,findValue);
        }else{
            return mid;
        }
        return -1;
    }

    /**
     * 通过二分查找相同元素
     * @param array 目标集合
     * @param left 集合的最右边
     * @param right 集合的最左边
     * @param findValue 目标值
     * @return 返回目标值的下标集合
     */
    private static ArrayList<Integer> getRepeatEleByBinaryFind(int[] array,int left,int right,int findValue){

        //若left>right说明遍历集合后并没有找到
        if(left>right){
            return new ArrayList<Integer>();
        }

        int mid = (left+right)/2;
        if(findValue<array[mid]){
            getRepeatEleByBinaryFind(array,left,mid-1,findValue);
        }
        else if(findValue>array[mid]){
            getRepeatEleByBinaryFind(array,mid+1,right,findValue);
        }else{
            //往左递归
            ArrayList<Integer> resIndexlist = new ArrayList<>();
            int temp = mid-1;
            while (true){
                if(temp<0||array[temp] !=findValue){
                    break;
                }
                resIndexlist.add(temp);
                temp-=1;
            }

            resIndexlist.add(mid);
            //对temp重新赋值
            temp = mid+1;
            while (true){
                if(temp>array.length-1 || array[temp] != findValue){
                    break;
                }
                resIndexlist.add(temp);
                temp+=1;
            }
            return resIndexlist;
        }
        return new ArrayList<Integer>();
    }

}
