package demo;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by teacher
 * 10:30 2016/4/15.
 */
public class ExceptionDemo {

    public static void a() throws NullPointerException {
        try {
            b();
            System.out.println(6);
        } catch (FileNotFoundException e) {
            System.out.println(7);
        }
        System.out.println(8);
        throw new NullPointerException();
    }

    public static void b() throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("", "rw");
        System.out.println(randomAccessFile);
    }

    public static void main(String[] args) {
        try {
            System.out.println(1);
            a();
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
// 1 3 4 5
// 1 7 8 3 4 5
