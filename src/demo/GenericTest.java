package demo;

import java.util.Vector;

/**
 * Created by teacher
 * 9:12 2016/4/14.
 */
public class GenericTest<T, S> {

    public String add(T x, S y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    public static void main(String[] args) {
        GenericTest<Integer, Integer> genericTest = new GenericTest<>();
        System.out.println(genericTest.add(1, 2));

        GenericTest<Double, Double> doubleGenericTest = new GenericTest<>();
        System.out.println(doubleGenericTest.add(1.1, 2.2));

        GenericTest<Boolean, String> booleanStringGenericTest = new GenericTest<>();
        System.out.println(booleanStringGenericTest.add(true, "hi"));

        Vector<String> vector = new Vector<>();
        vector.add("1");
        String s = vector.get(0);
        System.out.println(s);
    }
}