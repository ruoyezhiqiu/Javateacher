package demo;

/**
 * Created by teacher
 * 9:12 2016/4/14.
 */
public class GenericTest<T extends CharSequence> {

//    public static int add(int x, int y) {
//        return x + y;
//    }
//
//    public static double add(double x, double y) {
//        return x + y;
//    }

    public T add(T x, T y) {
        return x + y;
    }

    public static void main(String[] args) {

    }
}
