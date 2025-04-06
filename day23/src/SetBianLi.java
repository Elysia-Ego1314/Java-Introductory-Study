import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBianLi {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        //增强for遍历
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
