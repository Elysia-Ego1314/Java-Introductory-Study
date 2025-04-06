import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAPI {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("123","sad");
        map.put("1234","1433");
        map.put("qwer","1234");
        //map遍历
        //1.通过键找值
        //获取所有的键，把这些键放到一个单列集合中去
        Set<String> keys = map.keySet();
        //遍历单列表，得到每一个键
        /*for(String s:keys) {
            String value = map.get(s);
            System.out.println(s + " = " + value);
        }
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + " = " + map.get(s));
        }*/
        //2.键值对
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
