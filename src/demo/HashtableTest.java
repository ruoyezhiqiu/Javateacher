package demo;

import java.util.Hashtable;
import java.util.Random;

/**
 * Created by teacher
 * 14:59 2016/4/13.
 */

/*
随机生成[1,20]范围内的数1M次

        1.
        使用两种方法
        java.lang.Math
        java.util.Random

        2.
        比较两种方法的效率和分布
*/
public class HashtableTest {

    private Hashtable<Integer, Integer> hashtable;

    public HashtableTest() {
        hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0);
        }
    }

    public static void main(String[] args) {
        HashtableTest hashtableTest = new HashtableTest();
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int r = (int) (Math.random() * 20) + 1;
//            int r = random.nextInt(20) + 1;
            hashtableTest.hashtable.put(r, hashtableTest.hashtable.get(r) + 1); // ***
//            System.out.println(r);
        }
        for (Integer integer : hashtableTest.hashtable.keySet()) {
            System.out.println(integer + "\t->\t" + hashtableTest.hashtable.get(integer));
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
