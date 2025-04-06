package course;
/*
拼接字符串：
定义一个方法，把int数组按照指定的格式拼接成一个字符串并返回，调用该方法，并在控制台上输出结果
例如：
int[] arr = {1,2,3};
[1,2,3]
 */
public class SpliceString {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arrToString(arr));
	}
	public static String arrToString(int[] arr) {
		if (arr == null) {
			return "";
		}
		if (arr.length == 0) {
			return "[]";
		}
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result  = result + arr[i];
			if (i != arr.length-1) {
				result = result + ",";
			}
		}
		result = result + "]";
		return result;
	}
}
