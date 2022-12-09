package com.aron.minimallog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: aron
 * @date:2022-12-8 17:47
 * @description: api日志注解切面类
 */
@Aspect
@Component
public class ApiLogAspect {

    @Around("@annotation(com.aron.minimallog.annotation.ApiLog)")
    public Object apiLog(ProceedingJoinPoint point) {
        // 从切面织入点处通过反射机制获取织入点处的方法
        Signature signature = point.getSignature();
        point.getTarget().getClass().getName();

        //AOP也是需要占用用户线程的啊,AOP里面的耗时操作,会阻塞用户线程的
        //把复杂的操作提出来，然后做成发布订阅的异步方法 这样会极大的减少用户线程的阻塞时间
        //
        return null;
    }
}
