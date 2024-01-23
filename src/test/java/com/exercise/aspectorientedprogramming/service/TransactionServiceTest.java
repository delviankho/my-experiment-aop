package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.TransactionalServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TransactionalServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, TransactionalService.class})
class TransactionServiceTest {
    @Autowired
    private TransactionalService transactionalService;

    @Test
    void test_myTransactionalMethod_success(){
        transactionalService.myTransactionalMethod();
    }

    @Test
    void test_myTransactionalMethod2_success(){
        transactionalService.myTransactionalMethod2();
    }
}
