package com.exercise.aspectorientedprogramming.service.impl;

import com.exercise.aspectorientedprogramming.annotation.PerformanceMonitor;
import com.exercise.aspectorientedprogramming.service.PerformanceMonitoringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PerformanceMonitoringServiceImpl implements PerformanceMonitoringService {
    @PerformanceMonitor
    @Override
    public void performTask() {
        log.info("Performing the task");
    }

    @PerformanceMonitor
    @Override
    public void anotherTask() {
        log.info("Performing anotherTask");
    }
}
