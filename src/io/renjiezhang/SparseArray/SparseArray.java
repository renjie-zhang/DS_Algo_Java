package io.renjiezhang.SparseArray;

/**
 * @author: renjie.zhang
 * @date:2019/8/18
 * @Description: 稀疏数组
 */
public class SparseArray {
    public static void main(String[] args) {
        //原始数组是一个10*10的二维数组
        int oldArray[][] = new int[10][10];
        oldArray[1][2] = 1;
        oldArray[2][3] = 2;
        oldArray[4][5] = 2;
        //输出原始数组
        System.out.println("输出原来的数组");
        /*for(int i=0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.printf("%d\t",oldArray[i][j]);
            }
            System.out.println();
        }*/
        for(int[] row : oldArray){
            for(int data :row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //查找出原数组中的非零的个数
        int count = 0;
        for(int[] row:oldArray){
            for(int data:row){
                if(data != 0){
                    count++;
                }
            }
        }

        //根据原数组的情况创建出一个稀疏数组
        int sparseArray[][] = new int[count+1][3];
        sparseArray[0][0] = 10;
        sparseArray[0][1] = 10;
        sparseArray[0][2] = count;

        int flag = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(oldArray[i][j] != 0 ){
                    flag++;
                    sparseArray[flag][0] = i;
                    sparseArray[flag][1] = j;
                    sparseArray[flag][2] = oldArray[i][j];
                }
            }
        }
        //输出稀疏数组
        /*System.out.println("输出稀疏数组");
        for(int[] row :sparseArray){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }*/
        System.out.println("输出稀疏数组");
        for(int i = 0;i<sparseArray.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }
        //将稀疏数组变回数组
        System.out.println("变回原数组");
        int newArray[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i = 1;i<sparseArray.length;i++){
            newArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        //输出原数组
        for(int[] row:newArray){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
    /*
    输出原来的数组
    0	0	0	0	0	0	0	0	0	0
    0	0	1	0	0	0	0	0	0	0
    0	0	0	2	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	2	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    输出稀疏数组
    10	10	3
    1	2	1
    2	3	2
    4	5	2
    变回原数组
    0	0	0	0	0	0	0	0	0	0
    0	0	1	0	0	0	0	0	0	0
    0	0	0	2	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	2	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
    0	0	0	0	0	0	0	0	0	0
     */

}
