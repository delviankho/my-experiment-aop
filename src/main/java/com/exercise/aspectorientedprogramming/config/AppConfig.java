package com.exercise.aspectorientedprogramming.config;

import com.exercise.aspectorientedprogramming.annotation.aspect.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    AuditTrailAspect auditTrailAspect() {
        return new AuditTrailAspect();
    }

    @Bean
    ExceptionHandlingAspect exceptionHandlingAspect(){
        return new ExceptionHandlingAspect();
    }

    @Bean
    LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }

    @Bean
    PerformanceMonitoringAspect performanceMonitoringAspect(){
        return new PerformanceMonitoringAspect();
    }

    @Bean
    SecurityAspect securityAspect(){
        return new SecurityAspect();
    }

    @Bean
    TransactionAspect transactionAspect(){
        return new TransactionAspect();
    }

    @Bean
    ValidationAspect validationAspect(){
        return new ValidationAspect();
    }

    @Bean
    CalculatorAspect calculatorAspect(){
        return new CalculatorAspect();
    }

    @Bean
    PersonAspect personAspect(){
        return new PersonAspect();
    }
}
