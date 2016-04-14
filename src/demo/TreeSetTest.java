package demo;

import java.util.*;

/**
 * Created by teacher
 * 14:48 2016/4/14.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(-1);
        treeSet.add(100);
        treeSet.add(100);

//        treeSet = (TreeSet<Integer>) treeSet.descendingSet();

//        for (Integer integer : treeSet) {
//            System.out.println(integer);
//        }
        Iterator<Integer> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            Integer next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("---");
//        System.out.println(treeSet.first());
        System.out.println(treeSet.floor(2));

    }
}
