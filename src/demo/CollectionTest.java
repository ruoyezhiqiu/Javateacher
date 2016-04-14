package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by teacher
 * 13:11 2016/4/14.
 */
public class CollectionTest {
    public static void main(String[] args) {
//        Iterable // 迭代
//        Collection
//        Map

//        ArrayList<String> arrayList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("hi");
        stringList.add("hello");
        stringList.add("hello");

        System.out.println(stringList.get(0));
        System.out.println(stringList.size());
    }
}
