package com.seamcarving.client;

import com.seamcarving.lib.Picture;

import java.io.*;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws IOException {
        String path = "images/christmas_original.jpg";
        byte[] bytes = getBytesFromFilePath(path);
        System.out.println(Arrays.toString(bytes));

        Picture picture = new Picture(getFileFromByteArray(bytes));
        picture.show();
    }

    public static byte[] getBytesFromFilePath(String path) throws IOException {
        File file = new File(path);
        byte[] bytes = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bytes);
        fileInputStream.close();
        return bytes;
    }

    public static File getFileFromByteArray(byte[] bytes) throws IOException {
        File tempFile = File.createTempFile("temp", ".specialsuffix");
        tempFile.deleteOnExit();
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        fileOutputStream.write(bytes);
        return tempFile;
    }
}