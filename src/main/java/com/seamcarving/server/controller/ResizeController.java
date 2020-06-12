package com.seamcarving.server.controller;

import com.seamcarving.server.service.ResizeService;
import com.seamcarving.server.service.request.ResizeRequest;
import com.seamcarving.server.service.response.ResizeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resize")
public class ResizeController {

    @Autowired ResizeService resizeService;

    @GetMapping
    public ResizeResponse resize(@RequestBody ResizeRequest request) {
        return resizeService.resize(request);
    }

    @GetMapping("/test")
    public String ping() {
        return "Pong";
    }

}
