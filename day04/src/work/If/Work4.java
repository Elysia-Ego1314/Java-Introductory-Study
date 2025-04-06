package work.If;
/*
某商场购物可以打折，具体规则如下：
	普通顾客购不满100元不打折，满100元打9折；
	会员购物不满200元打8折，满200元打7.5折；
	不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
 */
import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顾客类型(0为普通，1为会员)");
		int customer = sc.nextInt();
		System.out.println("请输入金额");
		int price = sc.nextInt();
		if (customer == 0) {
			if (price <= 100) {
				System.out.println(price);
			} else {
				System.out.println(price * 0.9);
			}
		} else {
			if (price <= 200) {
				System.out.println(price * 0.8);
			} else {
				System.out.println(price * 0.75);
			}
		}
	}
}
