package com.seamcarving.server.service.response;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ResizeResponse {
    private final ArrayList<Byte> bytes;
}
