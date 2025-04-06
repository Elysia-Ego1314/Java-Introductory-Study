package course;
/*
给定两个字符串，A和B。A的旋转操作就是将A最左边的字符移动到最右边。
例如，若A = ‘abcde’，在移动一次之后结果就是‘bcdea’。
如果在若干次调整操作之后，A能变成B，那么返回true，否者返回false
*/
public class AdjustString {
	public static void main(String[] args) {
		String strA = "abcde";
		String strB = "bcdea";
		boolean result = check(strA,strB);
		System.out.println(result);
	}
	public static boolean check(String strA,String strB) {
		for (int i = 0; i < strA.length(); i++) {
			strA = rotate(strA);
			if (strA.equals(strB)) {
				return true;
			}
		}
		return false;
	}
	public static String rotate(String str) {
		//法一
		//return str.substring(1) + str.charAt(0);
		//法二
		char[] arr = str.toCharArray();
		char first = arr[0];
		for (int i = 1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = first;
		return new String(arr);
	}
}
