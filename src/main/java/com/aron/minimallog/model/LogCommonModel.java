package com.aron.minimallog.model;

import com.aron.minimallog.utils.DateUtil;
import com.aron.minimallog.utils.str.StringPool;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: aron
 * @date:2022-12-8 18:33
 * @description:
 */
public class LogCommonModel implements Serializable  {
    protected static final long serialVersionUID = 1L;

    /**
     * 应用的服务名称
     */
    protected String appName;

    /**
     * 服务器的IP
     */
    protected String serverIp;

    /**
     * 应用的端口
     */
    protected Integer appPort;

    /**
     * 服务器名
     */
    protected String serverName;

    /**
     * 环境
     */
    protected String env;

    /**
     * 请求来源方的IP
     */
    protected String visitorIp;

    /**
     * 用户代理
     */
    protected String userAgent;

    /**
     * 请求URI
     */
    protected String requestUri;

    /**
     * 请求方式
     */
    protected String requestMethod;

    /**
     * 方法所在的类
     */
    protected String methodClass;

    /**
     * 方法名
     */
    protected String methodName;

    /**
     * 请求提交的数据
     */
    protected String requestParams = StringPool.EMPTY;

    /**
     * 响应的数据
     */
    protected String responseData = StringPool.EMPTY;

    /**
     *
     */
    protected Integer status;

    /**
     * 目标接口执行时间
     */
    protected Long time;

    /**
     * 创建人，默认是空的
     */
    protected String createUser;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DateUtil.PATTERN_DATETIME)
    @JsonFormat(pattern = DateUtil.PATTERN_DATETIME)
    protected Date createTime = new Date();

}
