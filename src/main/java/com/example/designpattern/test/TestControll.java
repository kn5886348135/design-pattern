package com.example.designpattern.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControll {

    private TestService testService;

    public TestControll(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public String test() {
        return testService.findEntity("1").toString();
    }
}
