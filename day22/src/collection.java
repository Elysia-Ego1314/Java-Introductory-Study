import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);
        System.out.println(coll.contains("aaa"));//是否存在
        System.out.println(coll.isEmpty());//是否为空
        System.out.println(coll.size());
    }
}
