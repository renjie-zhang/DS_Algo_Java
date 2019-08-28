package io.renjiezhang.LinkedListQueue;


/**
 * @author: renjie.zhang
 * @date:2019/8/25-16:58
 * @Description: 链表实现队列测试
 */
public class Application {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        LinkedListQueue queue = new LinkedListQueue();
        queue.EnQueue(node1);
        queue.EnQueue(node2);
        queue.EnQueue(node3);
        System.out.println("输出queue");
        queue.show(queue.getHead());
        Node node = queue.DeQueue(queue.getHead());
        System.out.printf("queue出队：%d\n",node.data);
        Node node4 = queue.DeQueue(queue.getHead());
        System.out.printf("queue出队：%d\n",node4.data);
        Node node5 = queue.DeQueue(queue.getHead());
        System.out.printf("queue出队：%d\n",node5.data);

    }
    /*
        输出queue
        Node{data=1}
        Node{data=2}
        Node{data=3}
        queue出队：1
        queue出队：2
        queue出队：3
    */
}


