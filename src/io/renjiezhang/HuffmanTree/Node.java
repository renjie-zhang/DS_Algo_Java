package io.renjiezhang.HuffmanTree;

/**
 * @author: renjie.zhang
 * @date:2019/9/26-22:19
 * @Description: node节点
 */
public class Node implements Comparable<Node>{

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    /**
     * 前序遍历二叉树
     */
    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }

    @Override
    public int compareTo(Node o) {
        return this.value -o.value;
    }
}
