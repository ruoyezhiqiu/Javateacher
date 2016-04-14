package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by teacher
 * 15:16 2016/4/14.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(2, "hello");

        System.out.println(map.size());

        System.out.println(map.get(2));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + " > " + map.get(integer));
        }
        System.out.println("--------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
