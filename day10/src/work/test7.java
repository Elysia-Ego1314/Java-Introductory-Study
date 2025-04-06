package work;

import java.util.StringJoiner;

/*
定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
要求：
    1、如果传递的参数为空，返回null
    2、如果传递的数组元素个数为0，返回[]
    3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class test7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        String result = toStr(arr);
        System.out.println(result);
    }

    public static String toStr(int[] arr) {
        /*
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
        */
        if (arr == null) {
            return null;
        }
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0;i<arr.length;i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
