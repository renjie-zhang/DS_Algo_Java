package io.renjiezhang.ArrayStack;

/**
 * @author: renjie.zhang
 * @date:2019/8/28-22:20
 * @Description:
 */
public class Application {
    public static void main(String[] args) throws Exception {
        ArrayStack stack = new ArrayStack(4);
        System.out.println("向栈中添加数据");
        stack.push(34);
        stack.push(54);
        System.out.println("现在栈中的数据有：");
        stack.show();
        stack.push(45);
        System.out.println("开始出栈");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();
    }
}
