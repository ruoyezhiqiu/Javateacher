package demo;

import java.util.*;

/**
 * Created by teacher
 * 15:50 2016/4/14.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "hi");
        map.put(2, "hello");
        map.put(-1, "zoo");

        NavigableMap<Integer, String> navigableMap = map.descendingMap(); // TODO: 2016/4/14
        System.out.println(navigableMap);

        for (Integer integer : map.descendingKeySet()) {
            System.out.println(integer + " > " + map.get(integer));
        }
    }
}
