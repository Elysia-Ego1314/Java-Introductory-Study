import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[] str = {"50","70","300"};
		Random r = new Random();
		int[] nums = new int[3];
		for (int i = 0;i<417;i++) {
			int num = r.nextInt(3);
			nums[num]++;
		}
		int max = nums[0];
		int index = 0;
		for (int i = 1;i<3;i++) {
			if (max<nums[i]) {
				max = nums[i];
				index = i;
			}
		}
		System.out.println(nums[index]);
		System.out.println(str[index]);
	}
}