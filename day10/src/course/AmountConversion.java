package course;
/*
金额转换：
输入阿拉伯数字，转换为带有单位的七位大写数字
 */
import java.util.Scanner;

public class AmountConversion {
	public static void main(String[] args) {
		String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			num = sc.nextInt();
			if (num >= 0 && num <= 9999999) {
				break;
			} else {
				System.out.println("输入错误请重新输入");
			}
		}
		String moneyStr = "";
		while (num != 0) {
			moneyStr = str[num % 10] + moneyStr;
			num /= 10;
		}
		for (int i = 0; moneyStr.length() < 7; i++) {
			moneyStr = str[0] + moneyStr;
		}
		String[] unit = {"佰","拾","万","仟","佰","拾","元"};
		String result = "";
		for (int i = 0; i < moneyStr.length(); i++) {
			result = result + moneyStr.charAt(i) + unit[i];
		}
		System.out.println(result);
	}
}