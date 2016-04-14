package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by teacher
 * 13:11 2016/4/14.
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");

        arrayList.remove(2);
        arrayList.set(1, "hi2");

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());

        List<String> linkedList = new LinkedList<>();
        linkedList.add("hi");

        linkedList.set(0, "hello");

        System.out.println(linkedList.get(0));
        linkedList.remove(0);
        System.out.println(linkedList.size());
    }
}
