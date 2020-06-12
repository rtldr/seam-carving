package com.seamcarving.client;

import com.seamcarving.lib.Picture;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String path = "images/christmas_original.jpg";
        byte[] bytes = getBytesFromFilePath(path);
        Picture picture = getPictureFromByteArray(bytes);
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

    public static Picture getPictureFromByteArray(byte[] bytes) throws IOException {
        File tempFile = File.createTempFile("temp", ".tmp");
        tempFile.deleteOnExit();
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        fileOutputStream.write(bytes);
        return new Picture(tempFile);
    }
}