package io.renjiezhang.ArrayQueue;

/**
 * @author: renjie.zhang
 * @date:2019/8/19-21:49
 * @Description: 使用数组实现队列(存在问题：数组只能使用一次)
 */
public class ArrayQueue {
    //表示队列的最大容量
    private int maxSize;
    //对列的头
    private int front;
    //队列的尾
    private int rear;
    //数组
    private int[] arr;

    /**
     * 构造器
     * @param arrMaxSize 队列的最大容量
     */
    public ArrayQueue(int arrMaxSize){
        this.maxSize = arrMaxSize;
        this.arr = new int[maxSize];
        //-1表示front的前一个位置
        this.front = -1;
        //-1表示rear的最后一个数据
        this.rear = -1;
    }

    /**
     *判断队列是否已装满
     * @return
     */
    public boolean isFull(){
        return  rear == maxSize-1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 向队列中添加数据
     * @param n 数据
     */
    public void addToQueue(int n){
        if(isFull()){
            System.out.println("队列已满，不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 获得队列中的数据
     * @return
     */
    public int getData(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取出数据");
        }
        front++;
        return arr[front];
    }

    /**
     * 输出队列所有元素
     */
    public void Show(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\t",i,arr[i]);
            System.out.println();
        }
    }

    /**
     * 获取队列的头部数据
     * @return
     */
    public int headData(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，不能取出数据");
        }
        return arr[front+1];
    }
}