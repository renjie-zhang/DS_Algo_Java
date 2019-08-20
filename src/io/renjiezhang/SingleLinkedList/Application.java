package io.renjiezhang.SingleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/20-22:35
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        Node n1 = new Node(23);
        Node n2 = new Node(45);
        Node n3 = new Node(56);
        Node n4 = new Node(455);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(n1);
        singleLinkedList.addNode(n2);
        System.out.println("添加两个节点之后的链表");
        singleLinkedList.Show();
        singleLinkedList.addNode(n3);
        singleLinkedList.addNode(n4);
        System.out.println("添加四个节点之后的链表");
        singleLinkedList.Show();
        /*
        添加两个节点之后的链表
        Node{data=23}
        Node{data=45}
        添加四个节点之后的链表
        Node{data=23}
        Node{data=45}
        Node{data=56}
        Node{data=455}
        * */
    }
}
