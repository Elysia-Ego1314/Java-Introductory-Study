package work;

import java.util.Random;

/*
生成验证码
内容：可以是小写字母，也可以是大写字母，还可以是数字
规则：
    长度为5
    内容中是四位字母，1位数字。
    其中数字只有1位，但是可以出现在任意的位置。
 */
public class test3 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] arr = new char[5];
        int num = r.nextInt(10) + 48;
        arr[0] = (char)num;
        for (int i = 1;i<5;i++) {
            int j = r.nextInt(52);
            arr[i] = toChar(j);
        }
        char c;
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            int j = r.nextInt(arr.length);
            arr[i] = arr[j];
            arr[j] = c;
        }
        String result = new String(arr);
        System.out.println(result);
    }

    public static char toChar(int num) {
        //char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','j','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] arr = new char[52];
        for (int i = 0;i<26;i++) {
            arr[i] = (char)('a'+i);
        }
        for (int i = 26;i<52;i++) {
            arr[i] = (char)('A'+i-26);
        }
        return arr[num];
    }

}
