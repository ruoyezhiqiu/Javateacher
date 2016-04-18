package io;

import java.io.*;

/**
 * Created by teacher
 * 15:24 2016/4/18.
 */
public class BufferedTest {

    private static final String INPUT_FILE_NAME = "d:/ideaIU-15.0.2.exe";
    private static final String OUTPUT_FILE_NAME = "c:/test.exe";

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream(INPUT_FILE_NAME);
             OutputStream outputStream = new FileOutputStream(OUTPUT_FILE_NAME)) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(INPUT_FILE_NAME));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(OUTPUT_FILE_NAME))) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/io/BufferedTest.java"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
