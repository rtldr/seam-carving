package com.seamcarving.server.service;

import com.seamcarving.server.service.request.ResizeRequest;
import com.seamcarving.server.service.response.ResizeResponse;
import org.springframework.stereotype.Service;

@Service
public class ResizeService {
    public ResizeResponse resize(ResizeRequest request) {
        return new ResizeResponse(request.getBytes());
    }
}
