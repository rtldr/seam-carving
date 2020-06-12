package com.seamcarving.server.service.request;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ResizeRequest {
    private final int width;
    private final ArrayList<Byte> bytes;
}
