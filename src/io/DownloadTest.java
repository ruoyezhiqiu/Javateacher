package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by teacher
 * 16:49 2016/4/19.
 */
public class DownloadTest {

    private static final String SITE_URL = "http://www.vladstudio.com/zh/wallpapers/?skip=";
    private static final String HTML_FILE = "data/current.html";
    private static final String IMAGE_URL_CONTAINS_STRING = "http://files.vladstudio.com";
    private static final int TOTAL_PAGES = 21;
    private static int page;
    private static int pageCounter;
    private static int totalCounter;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_PAGES; i++) {
            saveFile(SITE_URL + (page++) * 24, HTML_FILE);
            extractImageURL();
            System.out.println("page " + page + " downloaded: " + pageCounter);
            pageCounter = 0;
        }
        System.out.println("total images: " + totalCounter);
    }

    private static void extractImageURL() {

        try (BufferedReader reader = new BufferedReader(new FileReader(HTML_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(IMAGE_URL_CONTAINS_STRING)) {
                    String imageURL = line.substring(line.indexOf("http"), line.indexOf("jpg") + 3);
                    saveFile(imageURL, "image/" + page + "-" + (++pageCounter) + ".jpg");
                    totalCounter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveFile(String urlString, String dest) {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url == null) {
            return;
        }
        try (BufferedInputStream inputStream = new BufferedInputStream(url.openStream());
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(dest))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
