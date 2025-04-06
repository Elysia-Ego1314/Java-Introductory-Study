package course;

import java.util.ArrayList;

/*
需求：定义一个集合，添加字符串，并进行遍历
 */
public class TraversalArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("xi");
		list.add("**");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
