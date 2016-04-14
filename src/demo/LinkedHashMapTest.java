package demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by teacher
 * 15:33 2016/4/14.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " > " + next.getValue());
        }
    }
}
