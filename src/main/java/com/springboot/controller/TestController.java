package com.springboot.controller;
import com.springboot.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    //method
    @GetMapping("/invokeService")
    public String invokeService() {
        return testService.invokeExternalService();
    }
}
