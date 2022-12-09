package com.aron.minimallog.utils.result;

/**
 * @className: RCode
 * @description:
 * @author: salad
 * @date: 2022/4/22
 **/
public enum RCode {

    SERVER_ERR("服务器异常",500),
    PARAMS_MISS("缺少请求参数",400),
    PARAM_FORMAT_ERROR("参数格式有误",400),
    PARAM_VALID_ERROR("参数验证失败",400),
    PARAM_BIND_ERROR("参数绑定失败",400),
    MSG_NOT_READABLE("消息无法读取",400),
    METHOD_NOT_SUPPORTED("不支持当前请求方法",405),
    MEDIA_TYPE_NOT_SUPPORTED("不支持的媒体类型",415),
    NOT_FOUND("请求的路径未找到",404),
    LOGIN_OK("登录成功",200),
    LOGIN_FAIL("登录失败",200),
    OPT_OK("操作成功",200),
    OPT_FAIL("操作失败",500),
    UN_AUTH("权限不足",403);

    private String message;

    private int code;

    RCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
