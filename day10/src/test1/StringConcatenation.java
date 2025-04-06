package test1;

import java.util.StringJoiner;

/*
定义一个方法，把int数组中的数据按照指定格式拼接成字符串并返回
例：
数组为 int[] arr{1,2,3};
执行后的输出结果为 [1, 2, 3];
 */
public class StringConcatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s1 = arrToString(arr);
        System.out.println(s1);
        String s2 = arrStringJoiner(arr);
        System.out.println(s2);
    }
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0;i<arr.length;i++) {
            if (i == arr.length-1) {
                result = result + arr[i];
            }else {
                result = result + arr[i] + ", ";
            }

        }
        result = result + "]";
        return result;
    }
    //使用StringJoiner方法
    public static String arrStringJoiner(int[] arr) {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0;i<arr.length;i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
}
