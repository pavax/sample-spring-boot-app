package com.mimacom.app.springboot.web;

import com.mimacom.app.springboot.domain.TestEntity;
import com.mimacom.app.springboot.domain.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestRepository testRepository;

    @Autowired
    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void addRandom() {
        TestEntity testEntity = new TestEntity();
        testEntity.setValue("TEST");
        testRepository.save(testEntity);
    }
}
