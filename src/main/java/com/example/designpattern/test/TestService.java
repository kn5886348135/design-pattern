package com.example.designpattern.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    private TestMapper testMapper;

    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public TestEntity findEntity(String id) {
        return testMapper.findEntity(id);
    }
}
