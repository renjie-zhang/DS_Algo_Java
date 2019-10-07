package io.renjiezhang.BinarySortTree;

/**
 * @author: renjie.zhang
 * @date:2019/10/7-21:01
 * @Description:
 */
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * add node
     * @param node
     */
    public void addNode(Node node){
        if (node == null){
            return;
        }
        if (node.value < this.value) {
            if (this.left == null){
                this.left = node;
            }else{
                this.left.addNode(node);
            }
        }else{
            if(this.right == null){
                this.right = node;
            }else{
                this.right.addNode(node);
            }
        }
    }

    /**
     * binaryTree print
     */
    public void infixOrder(){
        if(this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right != null){
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
