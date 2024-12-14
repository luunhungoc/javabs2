package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping("/api") // Base path for the API
public class PingController {

    @Value( "${min.dbserver}" )
    public String dbServer;

    @GetMapping("/ping")
    public String getPing() {
        return "For dbserver: "+ dbServer;
    }
}