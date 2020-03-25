package doublelinkedlist;


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
