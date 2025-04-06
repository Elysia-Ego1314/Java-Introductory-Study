package courseToArray;

/*
交换数组中的数据
定义一个数组{1, 2, 3, 4, 5}
交换前:1,2,3,4,5
交换后:5,4,3,2,1
 */
public class ExchangeNumber {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5};
		for (int i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		/*
		方法二
		for (int i = 0,j = array.length -1; i < j;i++,j--) {
			int temp = array[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		 */
	}
}
