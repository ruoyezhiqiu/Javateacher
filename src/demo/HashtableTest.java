package demo;

import java.util.Hashtable;

/**
 * Created by teacher
 * 14:59 2016/4/13.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "hi");
        hashtable.put(2, "hello");
        hashtable.put(2, "test");

        System.out.println(hashtable.get(2)); // hello

        System.out.println(hashtable.size()); // 2

//        hashtable.clear(); //

//        System.out.println(hashtable.size()); // 0

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + " -> " + hashtable.get(integer));
        }
    }
}
