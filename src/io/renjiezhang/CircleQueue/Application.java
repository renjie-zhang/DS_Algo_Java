package io.renjiezhang.CircleQueue;

/**
 * @author: renjie.zhang
 * @date:2019/8/19-22:54
 * @Description: circlequeue测试
 */
public class Application {
    public static void main(String[] args) {
        CircleQueue queue=new CircleQueue(4);
        queue.addToQueue(10);
        queue.show();
        queue.addToQueue(30);
        queue.show();
        queue.addToQueue(34);
        queue.show();

    }
}
