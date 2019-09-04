package io.renjiezhang.Josephus;

/**
 * @author: renjie.zhang
 * @date:2019/9/4-22:15
 * @Description: 约瑟夫问题 使用递归解决
 */
public class Josephus_2 {
    /**
     * 此方法防止递归调用栈溢出
     * @param total
     * @param index
     */
    static void getPosition_1(int total,int index){
        int result = 1;
        for (int i=2;i<=total;i++){
            result = (result+index-1)%i+1;
        }
        System.out.println("Last person left standing " +
                "(Josephus_2 Position) is " + result);
    }

    /**
     * 当total = 100000,会出现栈溢出
     * @param total
     * @return
     */
    static int getPosition_2(int total){
        int index = 2;
        if(total <=1){
            return 1;
        }
        return (getPosition_2(total-1)+index-1)%total+1;
    }

    public static void main(String[] args) {
        getPosition_1(10000,2);
        System.out.println("Last person left standing " +
                "(Josephus_2 Position) is " + getPosition_2(10000));
    }
}

/**
 * Last person left standing (Josephus_2 Position) is 3617
 * Last person left standing (Josephus_2 Position) is 3617
 */
