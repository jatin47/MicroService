package com.jatin.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


    @GetMapping ("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "user service is taking longer then expected";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "department service is taking longer then expected";
    }
    
}
