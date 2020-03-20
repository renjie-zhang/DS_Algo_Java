package io.renjiezhang.DoubleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/25-16:09
 * @Description: 双向链表测试
 */
public class Application {
    public static void main(String[] args) {
        Node node1 = new Node(23);
        Node node2 = new Node(24);
        Node node3 = new Node(45);
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addNode(node1);
        linkedList.addNode(node2);
        linkedList.addNode(node3);
        System.out.println("输出链表");
        linkedList.show();
        System.out.printf("链表的节点个数:%d\n",linkedList.getCount(linkedList.getHead()));
        System.out.println("删除链表中的一个节点");
        linkedList.deleteNode(node2);
        linkedList.show();

    }
}
