package course.twoObjectArrays.test1;

import course.twoObjectArrays.test1.Goods;

public class GoodsTest {
	public static void main(String[] args) {
		Goods[] arr = new Goods[3];
		Goods g1 = new Goods("001", "小米14", 3999, 100);
		Goods g2 = new Goods("002", "k70", 1999, 100);
		Goods g3 = new Goods("003", "遥遥领先", 13999, 2);
		arr[0] = g1;
		arr[1] = g2;
		arr[2] = g3;
		for (int i = 0; i < arr.length; i++) {
			Goods goods = arr[i];
			System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + " " + goods.getPrice() + " " + goods.getCount());
		}
	}
}
