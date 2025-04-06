package course;

/*
二维数组练习：
某商场每个季度的营业额如下：
第一季度：22， 66， 44
第二季度：77， 33， 88
第三季度：25， 45， 55
第四季度：11， 66， 99

要求计算出每个季度的总营业额和全年的总营业额
 */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{22, 66, 44}, {77, 33, 88}, {25, 45, 55}, {11, 66, 99}};
		int[] sum = new int[4];
		int yearSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			yearSum += sum[i];
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println("第" + (i + 1) + "季度的总营业额为：" + sum[i]);
		}
		System.out.println("全年的总营业额为：" + yearSum);
	}
}