package test1;

import java.util.Scanner;

/*
已知正确的用户名和密码，请程序实现模拟用户登录。
共给三次机会，登陆之后，给出相应提示
 */
public class User_Login {
    public static void main(String[] args) {
        String rightUserName = "zhangsan";
        String rightPassWord = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<3;i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String passWord = sc.next();
            if (userName.equals(rightUserName)&&passWord.equals(rightPassWord)) {
                System.out.println("用户登录成功");
                break;
            }else {
                if (i == 2) {
                    System.out.println("账户被锁定");
                }else{
                    System.out.println("用户名或密码有误,您还剩" + (2-i) + "次机会");
                }
            }
        }
    }
}
