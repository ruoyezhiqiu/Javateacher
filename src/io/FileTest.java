package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by teacher
 * 15:40 2016/4/18.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("c:/a/b/c/d");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.mkdirs());
    }
}
