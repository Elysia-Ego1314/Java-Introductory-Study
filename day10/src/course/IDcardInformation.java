package course;

/*
根据身份证信息，输出：
人物信息为:
出生年月日:XXXX年XX月XX日
性别为:男/女
 */
public class IDcardInformation {
	public static void main(String[] args) {
		String IDcard = "370921202403242125";
		System.out.println("人物信息为:");
		System.out.println("出生年月日:" + IDcard.substring(6, 10) + "年" + IDcard.substring(10, 12) + "月" + IDcard.substring(12, 14) + "日");
		char c = IDcard.charAt(16);
		if (c - '0' % 2 == 0) {
			System.out.println("性别为:男");
		} else {
			System.out.println("性别为:女");
		}
	}
}
