package io.renjiezhang.SingleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/20-22:14
 * @Description: 链表节点
 */
public class Node {
    public int data;
    public Node next;
    //构造方法
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

}
