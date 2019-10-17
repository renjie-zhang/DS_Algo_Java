package io.renjiezhang.DivideAndConquer;

/**
 * @author: renjie.zhang
 * @date:2019/10/16-22:50
 * @Description: 使用分治算法解决汉诺塔
 */
public class DivideAndConquer {
    public static void main(String[] args) {
        hanoiTower(5,'A','B','C');
    }

    private static void hanoiTower(int num,char a,char b,char c){
        if(num ==1){
            //如果只有一个盘，那么直接从a挪到c
           System.out.println("第1个盘从"+a+"->"+c);
        }else {
            //当大于等于两个盘的时候
            //先把最上面的盘挪到b
            hanoiTower(num-1,a,c,b);
            System.out.println("第"+num+"个盘从 "+a+"->"+c);
            hanoiTower(num-1,b,a,c);
        }
    }
}
