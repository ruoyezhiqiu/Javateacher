package io;

import java.io.*;

/**
 * Created by teacher
 * 13:53 2016/4/18.
 * 中
 */
public class ReaderWriterTest {
    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("src/io/ReaderWriterTest.java");
            writer = new FileWriter("data/temp.java");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
