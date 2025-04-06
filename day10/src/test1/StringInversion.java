package test1;
/*
定义一个方法，实现字符串的反转。
例：
输入：abc
输出：cba
 */
public class StringInversion {
    public static void main(String[] args) {
        String s = "abc";
        String result = reverser(s);
        System.out.println(result);
        String result1 = strStringBuilder(s);
        System.out.println(result1);
    }
    public static String reverser(String s) {
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            result = result + c;
            //System.out.println(c);
        }
        return result;
    }

    //使用StringBuilder方法
    public static String strStringBuilder(String s) {
        StringBuffer sb = new StringBuffer();
        String result = sb.append(s).reverse().toString();
        return result;
    }
}
