package io.renjiezhang.PrimeNumber;

import java.util.Scanner;

/**
 * @author: renjie.zhang
 * @date:2019/11/24-16:38
 * @Description: 判断一个数是否为素数
 */
public class PrimeNum {
    /**
     * 判断一个整数是否为素数
     * @param number 穿入参数
     * @return 若是素数返回1，如不是返回0
     */
    public static int prime(int number){
        int i;
        for(i = 2;i<=(int)Math.sqrt(number);i++){
            if (number%i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正数");
        int i = scanner.nextInt();
        System.out.printf("小于等于%d的素数：\n",i);
        if (i>2){
            System.out.printf("%4d",2);
            number++;
        }
        for (int j = 3;j<=i;j+=2){
            if (prime(j) == 1){
                System.out.printf("%4d",j);
                if (number != 0&&++number%10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
