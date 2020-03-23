package recursion;


public class EightQueue {
    //定义表示多少个皇后
    static int max = 8;
    //定义数组array，保存皇后放置的位置，比如arr = {0,4,7,5,2,6,1,3}
    static int[] array = new int[8];
    //总共的解法
    static int count;

    public static void main(String[] args) {
        check(0);
        System.out.printf("总共的解法有=%d",count);
    }

    //判断当前防止的位置，与前面已放置的点是否冲突
    /**
     * 判断放置的位置是否冲突
     * @param n 放置的行
     * @return 是否冲突
     */
    private static boolean judege(int n){
        for(int i = 0;i<n;i++){
            //array[i] == array[n] 判断是否在同一行
            //Math.abs(n-i) == Math.abs(array[n]-array[i]) 判断是否在同一条斜线上面
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    private static void check(int n){
        //如果等于max那么此时已经放置完成
        if (n==max){
            printResult();
            return;
        }
        //依次放入，并判断是否冲突
        for(int i = 0;i<max;i++){
            //先把这个皇后n放置在i位置
            array[n] = i;
            //判断该位置是否与已放置的冲突
            if(judege(n)){
                check(n+1);
            }
        }
    }
    //打印最终的结果
    private static void printResult(){
        count++;
        for(int i = 0 ;i<array.length;i++){
            System.out.print(array[i]+"");
        }
        System.out.println();
    }


}
