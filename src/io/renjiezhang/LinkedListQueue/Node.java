package io.renjiezhang.LinkedListQueue;

/**
 * @author: renjie.zhang
 * @date:2019/8/25-16:25
 * @Description: 链表实现队列  节点
 */
public class Node {
    int data;
    Node next;
    Node node;

    public Node(int data) {
        this.data = data;
        this.node = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
