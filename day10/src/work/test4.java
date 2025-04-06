package work;

import java.util.Scanner;

/*
请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
比如：Hello12345World中字母：10个，数字：5个。
 */
public class test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int zi = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
                zi++;
            }
            if (c>='0'&&c<='9') {
                num++;
            }
        }
        System.out.println(zi);
        System.out.println(num);
    }
}
