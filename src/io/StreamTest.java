package io;

import java.io.*;

/**
 * Created by teacher
 * 13:53 2016/4/18.
 * 中午
 */
public class StreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("src/io/StreamTest.java");
            outputStream = new FileOutputStream("data/temp.java");
            System.out.println(inputStream.available());
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
