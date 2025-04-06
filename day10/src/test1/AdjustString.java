package test1;

import java.util.Scanner;

/*
调整字符串：
给定两个字符串A和B
A的旋转操作就是将A最左边的数字移到最右边。
例如：A = ‘abcde’,在一次移动后就是‘bcdea’
如果在若干次操作后A可以变成B,那么返回true
否则返回false
 */
public class AdjustString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        boolean flag = check(A,B);
        System.out.println(flag);
    }


    public static boolean check(String A,String B) {
        for (int i = 0; i < A.length(); i++) {
            A = revolveString(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }
    public static String revolveString(String str) {
        //方法1   截取拼接
        /*str = str.substring(1) + str.substring(0,1);
        return str;*/
        //方法2   先变成字符数组，再调整里面的数据，再转化为字符串
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        String result = new String(arr);
        return result;
    }

}
