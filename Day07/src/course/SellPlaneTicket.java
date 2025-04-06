package course;

import java.util.Scanner;

/*
卖飞机票
需求：
机票价格按照淡季旺季、头等舱和经济舱收费,输入机票原价、月份和头等舱或经济舱
按照如下规则计算机票价格：旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折
 */
public class SellPlaneTicket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入机票价格:");
		double price = sc.nextDouble();
		System.out.println("请输入月份:");
		int month = sc.nextInt();
		System.out.println("请输入舱位(0:头等舱;1:经济舱)");
		int location = sc.nextInt();
		if (month >= 5 && month <= 10) {
			price = getPrice(price, location, 0.9, 0.85);
		} else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
			price = getPrice(price, location, 0.7, 0.65);
		} else {
			System.out.println("月份不合法");
		}
		System.out.println(price);
	}

	public static double getPrice(double price, int location, double v0, double v1) {
		if (location == 0) {
			price *= v0;
		} else if (location == 1) {
			price *= v1;
		} else {
			System.out.println("没有这个舱位");
		}
		return price;
	}
}
