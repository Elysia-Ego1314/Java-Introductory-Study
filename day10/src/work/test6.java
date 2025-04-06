package work;

import java.util.Scanner;

/*
我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class test6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        boolean flag = legalID(str);
        System.out.println(flag);
    }

    public static boolean legalID(String str) {
        if (str.length() != 18) {//检查长度
            return false;
        }
        if (str.charAt(0) == '0') {
            return false;
        }
        for (int i = 0;i<17;i++) {//检查1-17位
            if (str.charAt(i)<'0'||str.charAt(i)>'9') {
                return false;
            }
        }
        if ((str.charAt(17)>='0'&&str.charAt(17)<='9')||str.charAt(17)=='X') {
            return true;
        }
        return false;
    }
}
