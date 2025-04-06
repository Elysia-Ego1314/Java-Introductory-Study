package course;
/*
手机号屏蔽：
屏蔽中间四位手机号
 */
public class PhoneNumberShield {
	public static void main(String[] args) {
		String phoneNumber = "13112349468";
		System.out.println(phoneNumber.substring(0,3) + "****" + phoneNumber.substring(7));
	}
}
