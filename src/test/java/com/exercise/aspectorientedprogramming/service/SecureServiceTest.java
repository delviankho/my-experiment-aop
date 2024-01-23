package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.SecureServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SecureServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, SecureService.class})
class SecureServiceTest {

    @Autowired
    private SecureService secureService;

    @Test
    void test_secureMethod1_success(){
        AbstractAuthenticationToken abstractAuthenticationToken = new UsernamePasswordAuthenticationToken(
                "Username Password Auth",
                null,
                null
        );
        SecurityContextHolder.getContext().setAuthentication(abstractAuthenticationToken);

        secureService.secureMethod1();
    }

    @Test
    void test_secureMethod2_success(){
        AbstractAuthenticationToken abstractAuthenticationToken = new TestingAuthenticationToken("Testing Auth", null);
        SecurityContextHolder.getContext().setAuthentication(abstractAuthenticationToken);

        secureService.secureMethod2();
    }
}
