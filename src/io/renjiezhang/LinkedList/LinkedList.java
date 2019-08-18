package renjiezhang.LinkedList;

/**
 * @ClassName renjiezhang.LinkedList.LinkedList
 * @Description 链表
 * @Author joker
 * @Date 2019/8/15 16:51
 */
class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        //构造方法
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
