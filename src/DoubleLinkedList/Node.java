package io.renjiezhang.DoubleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/25-15:24
 * @Description: node节点
 */
public class Node {
    int data;
    Node next;
    Node pre;

    /**
     * 构造方法
     * @param data
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.pre = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
