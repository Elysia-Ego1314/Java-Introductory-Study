package work.If;

import java.util.Scanner;

/*
2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
	0 ~ 3000元的部分，交税3%
	3000 ~ 12000元的部分，交税10%
	12000 ~ 25000的部分 ， 交税20%
	25000 ~ 35000的部分，交税25%
	35000 ~ 55000的部分，交税30%
	55000 ~ 80000的部分，交税35%
	超过80000的部分，交税45%
比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。
税后工资12860元。
请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
 */
public class Work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wage = sc.nextInt();
		double fiveOne = wage * 0.1;
		double wageToTax = wage - fiveOne - 5000;
		double tax;
		if (wageToTax<=3000) {
			tax = wageToTax * 0.03;
			System.out.println(wage - tax - fiveOne);
		} else if (wageToTax <=12000) {
			tax = 3000 * 0.03 + (wageToTax - 3000) * 0.1;
			System.out.println(wage - tax - fiveOne);
		} else if (wageToTax <=25000) {
			tax = 3000 * 0.03 + 9000 * 0.1 + (wageToTax - 12000) * 0.2;
			System.out.println(wage - tax - fiveOne);
		} else if (wageToTax <=35000) {
			tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (wageToTax - 25000) * 0.25;
			System.out.println(wage - tax - fiveOne);
		} else if (wageToTax <=55000) {
			tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (wageToTax - 35000) * 0.3;
			System.out.println(wage - tax - fiveOne);
		} else if (wageToTax <=80000) {
			tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (wageToTax - 55000) * 0.35;
			System.out.println(wage - tax - fiveOne);
		} else {
			tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (wageToTax - 80000) * 0.45;
			System.out.println(wage - tax - fiveOne);
		}
	}
}
