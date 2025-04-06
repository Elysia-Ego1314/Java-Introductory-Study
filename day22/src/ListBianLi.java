import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListBianLi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //1.迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("----------------------------------------");
        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
        //列表迭代器
        ListIterator<String> lit = list.listIterator();//可以增加或删除
        while ( lit.hasNext() ) {
            String str = lit.next();
            if ("bbb".equals(str)) {
                lit.add("ttt");
            }
            if ("ddd".equals(str)) {
                lit.remove();
            }
        }
        System.out.println(list);
    }
}
