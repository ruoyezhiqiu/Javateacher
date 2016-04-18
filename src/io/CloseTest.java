package io;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by teacher
 * 14:56 2016/4/18.
 */
public class CloseTest implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("closed...");
    }

    public static void main(String[] args) {
//        try-with-resource
        try(CloseTest closeTest = new CloseTest()) {
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally...");
        }
    }
}
