package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by teacher
 * 14:43 2016/4/18.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("data/test.txt", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            randomAccessFile.seek(0L);
            for (int i = 0; i < 10; i++) {
                System.out.println(randomAccessFile.readDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
