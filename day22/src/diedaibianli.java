import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class diedaibianli {
    public static void main(String[] args) {
        //迭代器方法
        //Iteration<E> iteration();
        //常用方法
        //boolean hasNext() 判断当前位置是否有元素，有true，无false
        //E next()          获取当前位置的元素，并将迭代器对象移动到下一个位置
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
