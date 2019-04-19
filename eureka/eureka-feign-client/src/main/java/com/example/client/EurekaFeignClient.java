package com.example.client;

import com.example.client.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaFeignClient {

    @GetMapping("/hi")
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
