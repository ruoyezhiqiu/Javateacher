package demo;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by teacher
 * 14:35 2016/4/14.
 */
public class LinkedHashTest {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hi");
        linkedHashSet.add("hello");
        linkedHashSet.add("hello");

//        System.out.println(linkedHashSet.);

        System.out.println(linkedHashSet.size());

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
