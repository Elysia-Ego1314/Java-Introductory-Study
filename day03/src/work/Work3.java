package work;
/*
某小伙想定一份外卖，商家的优惠方式如下：
鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。
鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
那么这个小伙要点这三样东西，最少要花多少钱？
 */
public class Work3 {
	public static void main(String[] args) {
		int fish = 24;
		int oil = 8;
		int rice = 3;
		int sum = fish + oil + rice;
		double discountPrice = sum>=30?sum*0.8:sum;
		int preferencePrice = 16+8+3;
		System.out.println(discountPrice>preferencePrice?preferencePrice:discountPrice);
	}
}
