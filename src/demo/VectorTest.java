package demo;

import java.util.Vector;

/**
 * Created by teacher
 * 14:38 2016/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        String[] s = new String[10];
        Vector<String> strings = new Vector<>();

        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.get(0)); // hi

        System.out.println(strings.size()); // 2

        strings.clear(); //

        System.out.println(strings.size()); // 0
    }
}
