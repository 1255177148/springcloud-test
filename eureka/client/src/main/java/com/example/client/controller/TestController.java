package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port")
    private String port;

    @GetMapping("/hi")
    public ResponseEntity<String> home(@RequestParam("name") String name){
        String result = "hi " + name + ", i am from port:" + port;
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(result, status);
    }
}
