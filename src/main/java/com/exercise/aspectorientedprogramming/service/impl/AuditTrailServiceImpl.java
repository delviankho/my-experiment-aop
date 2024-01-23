package com.exercise.aspectorientedprogramming.service.impl;

import com.exercise.aspectorientedprogramming.annotation.AuditTrail;
import com.exercise.aspectorientedprogramming.service.AuditTrailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuditTrailServiceImpl implements AuditTrailService {
    @Override
    @AuditTrail(action = "CREATE", description = "Creating a new entity")
    public void createEntity() {
        log.info("Creating A New Entity");
    }

    @Override
    @AuditTrail(action = "UPDATE", description = "Updating an existing entity")
    public void updateEntity() {
        log.info("Updating an existing Entity");
    }
}
