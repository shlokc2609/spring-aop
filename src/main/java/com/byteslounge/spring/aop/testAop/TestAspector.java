package com.byteslounge.spring.aop.testAop;

import com.byteslounge.model.Account;
import com.byteslounge.model.test.BaseEntity;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by shlok.chaurasia on 22/11/15.
 */
@Aspect
public class TestAspector {
//    @AfterReturning("execution(* com.byteslounge.service.* &&" + "args(entity,..)")
            //+ "&& @annotation(PushEntity)")
    @AfterReturning(value = "com.byteslounge.spring.aop.testAop.PointcutTest.serviceLayer() && "
            + "args(entity,..)")
    public void beforeSave(BaseEntity entity) {
        System.out.println(entity.getBigfootData());
    }

}
