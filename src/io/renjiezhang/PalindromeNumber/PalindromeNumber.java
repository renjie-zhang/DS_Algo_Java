package io.renjiezhang.PalindromeNumber;

/**
 * @author: renjie.zhang
 * @date:2019/11/25-20:28
 * @Description: 判断字符串是否是回文字符串 程序的时间复杂度为O（n）
 */
public class PalindromeNumber {
    public static boolean isPalindromeNumber(String s){
        if (s.length() <= 1){
            return false;
        }
        char[] chars = s.toCharArray();
        for(int i = 0,j = chars.length-1;i<j;i++,j--){
            if (chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "adda";
        System.out.println("adda是否是回文字符串："+isPalindromeNumber(test1));
        System.out.println("asdfgfds是否是回文字符串："+isPalindromeNumber("asdfgfds"));
    }
}
