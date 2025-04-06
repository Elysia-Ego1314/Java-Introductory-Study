package test1;

import java.util.Scanner;

/*
转换罗马数字：
键盘录入一个字符串
要求一：长度为小于等于九
要求二：只能是数字
将内容变换为罗马数字
注意点：
罗马数字是没有0的
如果键盘录入包含0，可以将0变成" "（长度为0的字符串）
 */
public class ConvertRomanNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        while (true) {
            str = s.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            sb.append(changeRoman(num));
        }
        System.out.println(sb);
    }

    public static String changeRoman(int num) {
        String[] str = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return str[num];
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
