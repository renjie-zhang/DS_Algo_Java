package io.renjiezhang.Graph;

import java.util.*;

/**
 * @author: renjie.zhang
 * @date:2019/10/15-21:29
 * @Description: 创建图
 */
public class Graph {
    //存储顶点集合
    private ArrayList<String> vertexList;
    //存储图对应的邻接举证
    private int[][] edges;
    //表示边的数目
    private int numOfEdges;

    /**
     * 构造方法
     * @param number 顶点个数
     */
    public Graph(int number) {
        edges = new int[number][number];
        vertexList = new ArrayList<>(number);
        numOfEdges = 0;
    }

    /**
     * 显示图
     */
    public void showGraph(){
        for (int[] link:edges){
            System.out.println(Arrays.toString(link));
        }
    }
    /**
     * 返回value的权重值
     * @param value1 结点1
     * @param value2 结点2
     * @return 权重值
     */
    public int getWeight(int value1,int value2){
        return edges[value1][value2];
    }

    /**
     * 返回结点i对应的数据
     * @param i 结点
     * @return
     */
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    /**
     * 获得边的数目
     * @return 边的数目
     */
    public int getNumberOfEdges(){
        return numOfEdges;
    }
    /**
     * 获取图的结点
     * @return 图的结点
     */
    public int getNumberOfVertex(){
        return vertexList.size();
    }

    /**
     * 添加顶点
     * @param vertex
     */
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    /**
     * 添加无项边
     * @param value1 表示第一个顶点的下标
     * @param value2 表示第二个顶点的下标
     * @param weight 它们权重值
     */
    public void insertEdges(int value1,int value2,int weight){
        this.edges[value1][value2] = weight;
        this.edges[value2][value1] = weight;
        numOfEdges++;
    }
}
