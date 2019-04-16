package com.example.ribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name){
        ResponseEntity responseEntity = restTemplate.getForEntity("http://eureka-cilent/hi?name=" + name, String.class);
        return responseEntity.getBody().toString();

//        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
}
