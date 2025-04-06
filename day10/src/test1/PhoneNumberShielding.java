package test1;
/*
屏蔽手机号的中间四位
 */
public class PhoneNumberShielding {
    public static void main(String[] args) {
        String phoneNumber = "13121219356";
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
