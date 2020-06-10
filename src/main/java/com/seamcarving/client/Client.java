package com.seamcarving.client;

import com.seamcarving.lib.Picture;

public class Client {
    public static void main(String[] args) {
        String path = "images/christmas_original.jpg";
        Picture pic = new Picture(path);
        pic.show();
    }
}