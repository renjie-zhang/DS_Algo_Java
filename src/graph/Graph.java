package graph;


import java.util.*;


public class Graph {
    //存储顶点集合
    private ArrayList<String> vertexList;
    //存储图对应的邻接举证
    private int[][] edges;
    //表示边的数目
    private int numOfEdges;
    //定义一个booealn[]
    private boolean[] isVisited;

    /**
     * 构造方法
     * @param number 顶点个数
     */
    public Graph(int number) {
        edges = new int[number][number];
        vertexList = new ArrayList<>(number);
        numOfEdges = 0;
        isVisited= new boolean[5];
    }


    public void BFS(){
        for(int i=0;i<getNumberOfVertex();i++){
            if(!isVisited[i]){
                BFS(isVisited,i);
            }
        }
    }
    /**
     * 广度优先算法
     * @param isVisited
     * @param i
     */
    private void BFS(boolean[] isVisited,int i){
        //表示队列的头节点对应的下标
        int u;
        //表示邻接点
        int w;
        //链表-->记录结点访问顺序
        LinkedList list = new LinkedList();
        System.out.print(getValueByIndex(i)+"->");
        isVisited[i] = true;
        list.addLast(i);
        while (!list.isEmpty()){
            u = (Integer)list.removeFirst();
            w = getFirstVertex(u);
            while (w != -1){
                if(!isVisited[w]){
                    System.out.print(getValueByIndex(w)+"->");
                    isVisited[w] = true;
                    list.addLast(w);
                }
                w = getNextVertex(u,w);
            }
        }
    }

    /**
     * 图的深度优先算法
     * @param isVisited 是否已访问过
     * @param i
     */
    private void DFS(boolean[] isVisited,int i){
        //首先输出访问的结点
        System.out.print(getValueByIndex(i)+"-->");
        //将结点设置为已经访问
        isVisited[i] = true;
        //查找结点i的第一个邻接点w
        int w = getFirstVertex(i);
        while (w != -1){
            //说明存在邻接点
            if(!isVisited[w]){
                //未访问
                DFS(isVisited,w);
            }
            //如果未访问过
            w = getNextVertex(i,w);
        }

    }

    /**
     * DFS重载
     */
    public void DFS(){
        //遍历所有的结点
        for(int i =0 ;i<getNumberOfVertex();i++){
            if(!isVisited[i]){
                DFS(isVisited,i);
            }
        }
    }

    /**
     * 获得第一个邻接点的下标
     * @param index
     * @return
     */
    public int getFirstVertex(int index){
        for(int i = 0;i<vertexList.size();i++){
            if(edges[index][i] >0){
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据前一个邻接点的下标来获取下一个邻接点
     * @param value1
     * @param value2
     * @return
     */
    public int getNextVertex(int value1,int value2){
        for(int j =value2+1;j<vertexList.size();j++){
            if(edges[value1][j]>0){
                return j;
            }
        }
        return -1;
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
