package io.renjiezhang.Graph;

/**
 * @author: renjie.zhang
 * @date:2019/10/15-21:31
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        String vertexValue[] = {"A","B","C","D","E"};
        //添加顶点
        for(String vertex:vertexValue){
            graph.insertVertex(vertex);
        }
        //添加边
        //A-B A-C B-C B-D B-E
        graph.insertEdges(0,1,1);
        graph.insertEdges(0,2,1);
        graph.insertEdges(1,2,1);
        graph.insertEdges(1,3,1);
        graph.insertEdges(1,4,1);
        graph.showGraph();
    }
}
/*
输出
[0, 1, 1, 0, 0]
[1, 0, 1, 1, 1]
[1, 1, 0, 0, 0]
[0, 1, 0, 0, 0]
[0, 1, 0, 0, 0]
 */