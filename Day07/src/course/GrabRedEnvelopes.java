package course;

import java.util.Random;

/*
抢红包
需求：
一个大V直播抽奖，奖品是现金红包，分别有{2，588， 888， 1000， 10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项出现的顺序要随机且不重复
 */
public class GrabRedEnvelopes {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[]{2, 588, 888, 1000, 10000};
		//法二：打乱奖池
		for (int i = 0; i < arr.length; i++) {
			int randomIndex = r.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		/*
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length;) {
			int randomIndex = r.nextInt(arr.length);
			int prize = arr[randomIndex];
			if (!contains(newArr, prize)) {
				newArr[i] = prize;
				i++;
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		*/
	}

	/*
	public static boolean contains(int[] arr, int prize) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == prize) {
				return true;
			}
		}
		return false;
	}
	*/
}
