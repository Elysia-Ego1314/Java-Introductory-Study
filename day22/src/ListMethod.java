import java.util.ArrayList;

public class ListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        list.add(3,"eee");//在指定位置添加指定元素
        System.out.println(list);
        String s1 = list.remove(3);//删除指定位置元素并返回
        System.out.println(s1);
        System.out.println(list);
        String s2 = list.set(3,"eee");//修改指定索引元素，并返回被修改的元素
        System.out.println(s2);
        System.out.println(list);
        String s3 = list.get(1);//返回指定位置元素
        System.out.println(s3);
        System.out.println(list);
    }
}
