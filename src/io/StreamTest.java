package io;

import java.io.*;

/**
 * Created by teacher
 * 13:53 2016/4/18.
 * 中午
 */
public class StreamTest {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("src/io/StreamTest.java");
             OutputStream outputStream = new FileOutputStream("data/temp.java")) {
            System.out.println(inputStream.available());
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
