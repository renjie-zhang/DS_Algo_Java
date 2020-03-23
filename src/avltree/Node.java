package avltree;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 二叉树左旋
     */
    public void  leftRotate(){
        //第一步 以当前的根结点的值创建一个新节点
        Node newNode = new Node(value);
        //第二步 把新的结点的左子树设置成当前结点的左子树
        newNode.left = left;
        //第三步 把新的结点的右子树设置成当前结点的右子树的左子树
        newNode.right = right.left;
        //第四步 把当前结点的值换成右子树的值
        value = right.value;
        //第五步 把当前结点的右子树设置成当前结点的右子树的右子树
        right = right.right;
        //第六步 把当前的左子树设置成新的结点
        left = newNode;
    }

    /**
     * 二叉树右旋
     */
    public void rightRotate(){
        //第一步 以当前根节点的值创建一个新的结点
        Node newNode = new Node(value);
        //第二步 把新的结点的右子树设置成当前结点的右子树
        newNode.right = right;
        //第三步 把新的结点的左子树设置成当前结点的左子树的右子树
        newNode.left = left.right;
        //第四步 将当前结点的值修改成左子结点的值
        value = left.value;
        //第五步 将当前结点的左子树设置成左子树的左子树
        left = left.left;
        //第六步 将当前结点的右子结点设置成新的结点
        right = newNode;
    }
  /**
     * 返回当前结点的高度
     * @return
     */
    public int currentHeight(){
        return Math.max(left == null ?0:left.currentHeight(),right == null?0:right.currentHeight())+1;
    }

    /**
     * 返回左子树的高度
     * @return
     */
    public int leftHeight(){
        if(left == null){
            return 0;
        }
        return left.currentHeight();
    }

    /**
     * 返回右子树的高度
     * @return
     */
    public int rightHeight(){
        if(right == null){
            return 0;
        }
        return right.currentHeight();
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
        //当添加完成之后，左子树的高度大于右子树的高度 --->左旋转
        if(rightHeight() - leftHeight() >1){
            //双旋转
            if(right != null && right.leftHeight()> right.rightHeight()){
                right.rightRotate();
                leftRotate();
            }else{
                leftRotate();
            }
            //必须存在
            return;
        }
        //当添加完成之后，右子树高度大于左子树的高度--->右子树
        if(leftHeight() - rightHeight() > 1){
            //双旋转
            if(left != null && left.rightHeight() > left.leftHeight()){
                left.leftRotate();
                rightRotate();
            }else {
                rightRotate();
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
