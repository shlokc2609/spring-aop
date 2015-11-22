package com.byteslounge.spring.aop.testAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by shlok.chaurasia on 22/11/15.
 */
@Aspect
public class PointcutTest {
    @Pointcut("within(com.byteslounge.service.test..*)")
    public void serviceLayer() {
    }

}
