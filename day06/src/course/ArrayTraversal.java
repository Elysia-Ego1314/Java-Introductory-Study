package course;

/*
数组遍历：
设计一个方法用于数组遍历，要求遍历的结果是在同一行上的，例如：[11, 22, 33, 44, 55]
 */
public class ArrayTraversal {
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "]");
	}
}
