package io.renjiezhang.Josephus;

/**
 * @author: renjie.zhang
 * @date:2019/9/4-22:03
 * @Description: 约瑟夫问题 单向循环链表解决 Time complexity: O(m * n)
 */
public class Josephus_1 {

    static class Node{
        int data;
        Node next;
        public Node(int value){
            this.data = value;
        }
    }

    /**
     * 将得出最终剩下的一个点
     * @param index 每隔多少个弹出
     * @param total 总共的数量
     */
    static void getPosition(int index,int total){
        //1、首先创建一个头节点，然后将total中的数据存入一个循环链表中
        Node head = new Node(1);
        Node prev = head;
        for(int i = 1;i<=total;i++){
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head;
        //创建两个临时节点
        Node first = head;
        Node second = head;
        while (first != first.next){
            int count = 1;
            while(count != index){
                second = first;
                first = first.next;
                count++;
            }
            second.next = first.next;
            System.out.printf("delete from cirecle linkedlist :%d\n",first.data);
            first = second.next;
        }
        System.out.println ("Last person left standing " +
                "(Josephus_1 Position) is " + first.data);
    }


    public static void main(String[] args) {
        int total =10,index = 2;
        getPosition(index,total);
    }
}
/**
 * delete from cirecle linkedlist :1
 * delete from cirecle linkedlist :3
 * delete from cirecle linkedlist :5
 * delete from cirecle linkedlist :7
 * delete from cirecle linkedlist :9
 * delete from cirecle linkedlist :1
 * delete from cirecle linkedlist :4
 * delete from cirecle linkedlist :8
 * delete from cirecle linkedlist :2
 * delete from cirecle linkedlist :10
 * Last person left standing (Josephus_1 Position) is 6
 */
