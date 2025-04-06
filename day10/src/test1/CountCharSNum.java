package test1;

import java.util.Scanner;

/*
输入字符串，统计大写字母、小写字母和数字的出现次数
 */
public class CountCharSNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigNUM = 0;
        int smallNum = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>='a'&&c<='z') {
                smallNum++;
            }else if (c>='A'&&c<='Z') {
                bigNUM++;
            }else if (c>='0'&&c<='9') {
                number++;
            }
        }
        System.out.println("大写字母共" + bigNUM + "个  小写字母共" + smallNum + "个  数字共" + number + "个");
    }
}
