package circlequeue;


public class CircleQueue {
    //表示队列的最大容量
    private int maxSize;
    //对列的头
    private int front;
    //队列的尾
    private int rear;
    //数组
    private int[] arr;

    /**
     * 构造方法
     * @param arrMaxSize 数组的最大容量
     */
    public CircleQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[arrMaxSize];
        rear = 0;
        front = 0;
    }
    /**
     *判断队列是否已装满
     * @return
     */
    public boolean isFull(){
        return  (rear+1)%maxSize == front;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 想队列中加入数据
     * @param n
     * @return
     */
    public void addToQueue(int n){
        if (isFull()){
            System.out.println("队列已满，不能加入数据");
            return;
        }
        arr[rear] = n;
        //将rear后移，必须进行取模
        rear = (rear+1)%maxSize;
    }

    /**
     * 取出队列中的数据
     * @return
     */
    public int getData(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取出数据");
        }
        //这里需要分析出front是指向队列的第一个元素
        //1使用临时变量存储front的值
        //2先将front后移，再取模
        //3返回临时变量
        int temp = arr[front];
        front = (front+1)%maxSize;
        return  temp;
    }

    public void show(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for(int i = front;i<front+Count();i++){
            System.out.printf("arr[%d] = %d\n",i%maxSize,arr[i%maxSize]);
        }
    }

    /**
     * 队列中的有效元素
     * @return
     */
    public int Count(){
        return (rear+maxSize-front)%maxSize;
    }

    /**
     * 获得头元素
     * @return
     */
    public int headDate(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，不能取出数据");
        }
        return arr[front];
    }
}
