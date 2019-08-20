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
        System.out.println("添加一个数据之后的队列");
        queue.show();
        queue.addToQueue(30);
        queue.addToQueue(34);
        System.out.println("添加三个数据之后的队列");
        queue.show();
        System.out.printf("取出一个数据%d\n",queue.getData());
        System.out.println("添加一个数据");
        queue.addToQueue(12);
        queue.show();

    }
}
