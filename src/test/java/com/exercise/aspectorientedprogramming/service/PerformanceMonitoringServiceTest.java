package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.PerformanceMonitoringServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PerformanceMonitoringServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, PerformanceMonitoringService.class})
public class PerformanceMonitoringServiceTest {

    @Autowired
    private PerformanceMonitoringService performanceMonitoringService;

    @Test
    void test_performTask_success(){
        performanceMonitoringService.performTask();
    }

    @Test
    void test_anotherTask_success(){
        performanceMonitoringService.anotherTask();
    }

}
