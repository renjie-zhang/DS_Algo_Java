package io.renjiezhang.ArrayStack;

/**
 * @author: renjie.zhang
 * @date:2019/8/28-22:09
 * @Description: 使用数组实现栈
 */
public class ArrayStack {
    private int Maxsize;
    private int top;
    private int[] stack;

    /**
     * 构造方法
     * @param maxsize
     */
    public ArrayStack(int maxsize) {
        Maxsize = maxsize;
        this.stack = new int[maxsize];
        this.top = -1;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 判断是否已满
     * @return
     */
    public boolean isFull(){
        return top == Maxsize -1;
    }

    /**
     * 想栈中加入数据
     * @param i
     */
    public void push(int i) throws Exception {
        if(isFull()){
            throw new Exception("栈已满,无法入栈");
        }
        top++;
        stack[top] = i;
    }

    /**
     * 出栈
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("栈为空，无法出栈");
        }
        int value = stack[top];
        top--;
        return value;
    }
    public void show(){
        if (isEmpty()){
            System.out.println("栈为空");
        }
        for(int i=top;i>=0;i--){
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

}
