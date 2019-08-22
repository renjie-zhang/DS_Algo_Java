package io.renjiezhang.SingleLinkedList;

import com.sun.org.apache.bcel.internal.generic.NEW;

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
        System.out.println("删除第一个节点");
        singleLinkedList.deleteNode(n1);
        singleLinkedList.Show();
        System.out.println("删除第四个节点");
        singleLinkedList.deleteNode(n4);
        singleLinkedList.Show();
        Node head = singleLinkedList.GetHead();
        System.out.printf("链表现在的有效个数是%d",singleLinkedList.GetCount(head));
        System.out.println("查找倒数第一个节点");
        Node node = singleLinkedList.GetLastIndex(singleLinkedList.GetHead(), 1);
        System.out.println(node.toString());
        Node n5 = new Node(57);
        Node n6 = new Node(45);
        singleLinkedList.addNode(n5);
        singleLinkedList.addNode(n6);
        singleLinkedList.ReverseLinkedList(singleLinkedList.GetHead());
        System.out.println("反转链表之后");
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
        删除第一个节点
        Node{data=45}
        Node{data=56}
        Node{data=455}
        删除第四个节点
        Node{data=45}
        Node{data=56}
        链表现在的有效个数是2查找倒数第一个节点
        Node{data=56}
        反转链表之后
        Node{data=45}
        Node{data=57}
        Node{data=56}
        Node{data=45}
        * */
    }
}
