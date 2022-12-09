package com.aron.minimallog.annotation;

import com.aron.minimallog.props.OperationType;

import java.lang.annotation.*;

/**
 * @author: aron
 * @date:2022-12-8 17:47
 * @description: api日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiLog {
    /**
     * 日志模块名称
     */
    String value();

    /**
     * 操作类型
     */
    OperationType operationType() default OperationType.OTHER;

    /**
     * 是否保存响应数据
     */
    boolean isSaveRespData() default false;
}
