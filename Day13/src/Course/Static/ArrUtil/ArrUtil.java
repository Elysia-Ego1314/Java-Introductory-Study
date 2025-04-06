package Course.Static.ArrUtil;

import java.util.StringJoiner;

public class ArrUtil {
	private ArrUtil() {
	}

	public static String printArr(int[] arr) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int i = 0; i < arr.length; i++) {
			sj.add(String.valueOf(arr[i]));
		}
		return sj.toString();
	}

	public static double getAve(double[] arr) {
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		return average / arr.length;
	}
}
