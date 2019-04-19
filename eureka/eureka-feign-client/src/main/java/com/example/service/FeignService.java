package com.example.service;

import com.example.client.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {

    @Autowired
    EurekaFeignClient feignClient;

    public String sayHi(String name){
        return feignClient.sayHiFromClient(name);
    }
}
