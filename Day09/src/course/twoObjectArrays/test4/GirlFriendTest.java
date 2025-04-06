package course.twoObjectArrays.test4;

public class GirlFriendTest {
	public static void main(String[] args) {
		GirlFriend[] arr = new GirlFriend[4];
		GirlFriend gf1 = new GirlFriend("爱莉希雅", 24, "play");
		GirlFriend gf2 = new GirlFriend("丽塔", 22, "cook");
		GirlFriend gf3 = new GirlFriend("宵宫", 18, "firework");
		GirlFriend gf4 = new GirlFriend("流萤", 20, "with me");
		arr[0] = gf1;
		arr[1] = gf2;
		arr[2] = gf3;
		arr[3] = gf4;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend girlFriend = arr[i];
			sum = sum + girlFriend.getAge();
		}
		int avg = sum / arr.length;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend girlFriend = arr[i];
			if (girlFriend.getAge() < avg) {
				count++;
				System.out.println(girlFriend.getName() + " " + girlFriend.getAge() + " " + girlFriend.getHobby());
			}
		}
		System.out.println(count);
	}
}
