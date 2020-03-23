package singlelinkedlist;

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
