package com.exercise.aspectorientedprogramming.annotation.aspect;

import com.exercise.aspectorientedprogramming.annotation.AuditTrail;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AuditTrailAspectTest {

    @InjectMocks
    private AuditTrailAspect auditTrailAspect;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void auditTrail_ShouldLogAuditInformation() throws Throwable {
        AuditTrail auditTrailAnnotation = createAuditTrailAnnotation();
        Method method = getMethod();
        ProceedingJoinPoint joinPoint = createJoinPoint(method);

        assertDoesNotThrow(() -> auditTrailAspect.auditTrail(joinPoint, auditTrailAnnotation));
    }

    private AuditTrail createAuditTrailAnnotation() {
        return new AuditTrail() {
            @Override
            public Class<? extends java.lang.annotation.Annotation> annotationType() {
                return AuditTrail.class;
            }

            @Override
            public String description() {
                return "Create";
            }

            @Override
            public String action() {
                return "Create Something";
            }
        };
    }

    private ProceedingJoinPoint createJoinPoint(Method method) {
        ProceedingJoinPoint joinPoint = mock(ProceedingJoinPoint.class);
        MethodSignature signature = mock(MethodSignature.class);

        when(joinPoint.getSignature()).thenReturn(signature);
        when(signature.getMethod()).thenReturn(method);

        return joinPoint;
    }

    private Method getMethod() throws NoSuchMethodException {
        Method[] methods = TestClass.class.getMethods();
        for (Method method : methods) {
            return method;
        }
        throw new NoSuchMethodException("Method not found");
    }

    static class TestClass {
        public void dummyMethod() {}
    }
}
