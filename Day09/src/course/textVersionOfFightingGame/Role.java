package course.textVersionOfFightingGame;

import java.util.Random;

public class Role {
	private String name;
	private int blood;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public Role(String name, int blood) {
		this.name = name;
		this.blood = blood;
	}

	public Role() {
	}

	//定义一个方法用于攻击别人
	//r1.攻击(r2);
	//方法的调用者去攻击参数
	public void attack(Role role) {
		//造成的伤害
		Random r = new Random();
		int hurt = r.nextInt(20) + 1;
		//剩余的血量
		int remainBlood = role.getBlood() - hurt;
		remainBlood = remainBlood < 0 ? 0 : remainBlood;
		//修改剩余血量
		role.setBlood(remainBlood);
		System.out.println(this.name + "举起拳头打了" + role.getName() + "一下，" +
				"造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + role.getBlood() + "点血");
	}
}
