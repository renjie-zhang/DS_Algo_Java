package io.renjiezhang.ArrayQueue;

/**
 * @author: renjie.zhang
 * @date:2019/8/19-22:07
 * @Description: ArrayQueue测试
 */
public class Application {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.addToQueue(1);
        queue.addToQueue(4);
        queue.addToQueue(56);
        System.out.println("输出打印队列中所有元素");
        queue.Show();
        System.out.printf("取出队列的头部数据:%d\n",queue.headData());
        queue.addToQueue(23);

    }
}
