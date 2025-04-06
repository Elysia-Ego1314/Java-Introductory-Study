import java.util.ArrayList;
import java.util.Collection;

public class forplus {
    public static void main(String[] args) {
        //增强for遍历：适用于单列集合，和数组
        /*
        格式
        for(元素的数据类型 变量名:数组或者集合) {
        }
         */
        Collection<String> coll = new ArrayList<>();
        coll.add("ye");
        coll.add("xiao");
        coll.add("lei");
        for (String s:coll) {
            System.out.println(s);
        }
    }
}
