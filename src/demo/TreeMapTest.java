package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

//        map = (TreeMap<Integer, String>) map.descendingMap(); // TODO: 2016/4/14


        for (Integer integer : map.descendingKeySet()) {
            System.out.println(integer + " > " + map.get(integer));
        }
    }
}
