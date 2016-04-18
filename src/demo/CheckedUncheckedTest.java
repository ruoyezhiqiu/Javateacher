package demo;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by teacher
 * 13:33 2016/4/18.
 */
public class CheckedUncheckedTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("c:/IsNotebook.dll", "r");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
