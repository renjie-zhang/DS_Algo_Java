package binarysorttree;

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
     * 查找删除的节点
     * @param value 节点的value
     * @return
     */
    public Node searchTarget(int value){
        if(value == this.value){
            return this;
        }else if(value<this.value){
            //如果左子结点为空
            if(this.left == null){
                return null;
            }
            return this.left.searchTarget(value);
        }else{
            if(this.right == null){
                return null;
            }
            return this.right.searchTarget(value);
        }
    }

    /**
     * 查找需要删除节点的父结点
     * @param value 要查找的结点的值
     * @return 如果没有找到返回空
     */
    public Node searchTargetParent(int value){
        if((this.left != null&& this.left.value == value) ||
                (this.right != null&&this.right.value == value)){
            return this;
        }else {
            if (value <this.value && this.left != null) {
                return this.left.searchTargetParent(value);
            }else if(value>=this.value && this.right != null){
                return this.right.searchTargetParent(value);
            }else {
                return null;
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
