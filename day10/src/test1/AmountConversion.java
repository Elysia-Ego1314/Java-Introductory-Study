package test1;

import java.util.Scanner;

/*
金额转换
输入阿拉伯数字，转化为七位带单位的大写金额
例如：
2135--->
零佰零拾零万贰仟壹佰叁拾伍元
逆推法
-->零零零贰壹叁伍
-->贰壹叁伍
-->2135
 */
public class AmountConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请录入金额");
        int money;
        while (true) {
            money = s.nextInt();
            if (money > 0 && money < 9999999) {
                break;
            }else {
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        while(true) {
            int ge = money%10;
            moneyStr = numToStr(ge) + moneyStr;
            money = money/10;
            if (money == 0) {
                break;
            }
        }
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        String nextMoneyStr = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            nextMoneyStr = nextMoneyStr + moneyStr.charAt(i) + arr[i];
        }
        System.out.println(nextMoneyStr);
    }

    //查表法,根据传过来的数，作为索引，传回相应的大写的数字
    public static String numToStr(int num) {
        String[] number = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return number[num];
    }
}
