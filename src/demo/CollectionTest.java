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
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(String.valueOf(i));
//            linkedList.add(String.valueOf(i));
        }

        long start = System.currentTimeMillis();
        System.out.println(arrayList.get(499999)); // O(1)
//        System.out.println(linkedList.get(499999)); // O(n)
        System.out.println(System.currentTimeMillis() - start);
    }
}
