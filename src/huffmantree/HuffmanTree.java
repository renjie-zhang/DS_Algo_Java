package huffmantree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HuffmanTree {
    public static void main(String[] args) {
        int array[] = {13,7,8,3,29,6,1};
        Node root = createHuffmanTree(array);
        root.preOrder();
    }

    public static Node createHuffmanTree(int[] array){
        //1、遍历array数组将数组中的每个元素构成一个Node
        List<Node> nodes = new ArrayList<Node>();
        for(int v:array){
            nodes.add(new Node(v));
        }

        while (nodes.size()>1){
            Collections.sort(nodes);

            //2、取出数组中权值最小的两颗二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            //3、构建一颗新的二叉树
            Node parent = new Node(leftNode.value+rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            //4、从list集合中移除以取出的节点
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //将parent加入到集合中
            nodes.add(parent);
        }
        return nodes.get(0);
    }


    /**
     * 前序遍历二叉树
     * @param root root节点
    */
    public static void preOrder(Node root){
        if(root != null){
            root.preOrder();
        }else{
            System.out.println("该节点为空，无法遍历树");
        }
    }
}
