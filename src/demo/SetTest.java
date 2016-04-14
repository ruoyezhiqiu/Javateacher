package demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by teacher
 * 14:24 2016/4/14.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("hi");
        hashSet.add("hello");
        hashSet.add("Hello");

//        System.out.println(hashSet.);
        System.out.println(hashSet.size());
    }
}
