package binarysorttree;

public class BinarySortTree {

    private Node root;
    /**
     *添加结点
     * @param node
     */
    public void add(Node node){
        if(root == null){
            root = node;
        }else {
            root.addNode(node);
        }
    }

    /**
     * 删除结点
     * @param node
     */
    //todo 删除结点的另外一个方法
    public void deleteNode(Node node){
        if(root == null){
            return;
        }else {
            //1、先查找删除的结点
            Node targetNode = searchTarget(node.value);
            // 如果结点为空
            if(targetNode == null){
                return;
            }
            //如果发现二叉树只有一个结点
            if(root.left == null&& root.right == null){
                root = null;
                return;
            }
            //查找target的父结点
            Node targetParent = searchTargetParent(node.value);
            //此时删除的结点时一个叶子结点
            if(targetNode.left == null && targetNode.right == null){
                if(targetParent.left != null&&targetParent.left.value == node.value){
                    targetParent.left = null;
                    return;
                }else if (targetParent.right != null && targetParent.right.value == node.value){
                    targetParent.right = null;
                    return;
                }
            }else if (targetNode.left != null && targetNode.right != null){
                    int minValue = delRightTree(targetNode.right);
                    targetNode.value = minValue;
            }else {
                //删除的结点有左子结点
                if(targetNode.left != null){
                    if(targetParent != null){
                        if(targetParent.left.value == node.value){
                            targetParent.left = targetNode.left;
                        }else {
                            targetParent.right = targetNode.left;
                        }
                    }else{
                        root = targetNode.left;
                    }
                }else {
                    if(targetParent != null){
                        if(targetParent.left.value == node.value){
                            targetParent.left = targetNode.right;
                        }else {
                            targetParent.right = targetNode.right;
                        }
                    }else {
                        root = targetNode.right;
                    }
                }
            }
        }
    }

    /**
     * 二叉树
     * @param node
     * @return
     */
    public int delRightTree(Node node){
        Node target = node;
        while (target.left != null){
            target = target.left;
        }
        deleteNode(target);
        return target.value;
    }

    /**
     * 查找删除结点
     * @param value
     * @return
     */
    public Node searchTarget(int value){
        if(root == null){
            return null;
        }else {
            return root.searchTarget(value);
        }
    }

    /**
     * 查找删除结点的父结点
     * @param value
     * @return
     */
    public Node searchTargetParent(int value){
        if (root == null){
            return null;
        }else {
            return root.searchTargetParent(value);
        }
    }

    public void infixOrder(){
        if(root == null){
            System.out.println("binary tree is null");
        }else {
            root.infixOrder();
        }
    }
}

