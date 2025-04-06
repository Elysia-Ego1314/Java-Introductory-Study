package work;

import java.util.Scanner;

/*
请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class test5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        boolean flag = strR(str);
        System.out.println(flag);
    }

    public static boolean strR(String str) {
        StringBuffer sb = new StringBuffer(str);
        String strA = sb.reverse().toString();
        if (str.equals(strA)) {
            return true;
        }else {
            return false;
        }
    }
}
