package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.AuditTrailServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AuditTrailServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, AuditTrailService.class})
class AuditTrailServiceTest {

    @Autowired
    private AuditTrailService auditTrailService;

    @Test
    void test_createEntity_success(){
        auditTrailService.createEntity();
    }

    @Test
    void test_updateEntity_success(){
        auditTrailService.updateEntity();
    }

}
