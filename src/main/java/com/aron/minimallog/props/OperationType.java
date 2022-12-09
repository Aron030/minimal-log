package com.aron.minimallog.props;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: aron
 * @date:2022-12-8 18:10
 * @description: 日志操作类型
 */
@Getter
@AllArgsConstructor
public enum OperationType {
    /**
     * 登录操作
     */
    LOGIN("登录操作"),

    /**
     * 登出操作
     */
    LOGOUT("登出操作"),

    /**
     * 查询操作
     */
    SELECT("查询操作"),

    /**
     * 新增操作
     */
    INSERT("新增操作"),

    /**
     * 修改操作
     */
    UPDATE("修改操作"),

    /**
     * 删除操作
     */
    DELETE("删除操作"),

    /**
     * 其它操作
     */
    OTHER("其它操作");

    /**
     * 操作名称
     */
    private final String name;

}
