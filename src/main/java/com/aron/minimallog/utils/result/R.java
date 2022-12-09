package com.aron.minimallog.utils.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: R
 * @description:
 * @author: salad
 * @date: 2022/4/22
 **/
@Data
@AllArgsConstructor
public class R<T> {

    private String message;
    private int code;
    private boolean success;
    private T data;

    public static <T> R<T> success(String message, int code, T data){
        return new R<T>(message,code,true,data);
    }

    public R(RCode code, boolean success, T data){
        this.message = code.getMessage();
        this.code = code.getCode();
        this.success = success;
        this.data = data;
    }

    public static <T> R<T> success(String message, T data){
        return new R<T>(message,200,true,data);
    }

    public static <T> R<T> success(T data){
        return new R<T>(RCode.OPT_OK,true,data);
    }

    public static <T> R<T> status(boolean status){
        return new R<T>(status ? RCode.OPT_OK : RCode.OPT_FAIL,status,null);
    }

    public static <T> R<T> fail(String message, int code){
        return new R<T>(message,code,false,null);
    }

    public static <T> R<T> fail(String message){
        return new R<T>(RCode.SERVER_ERR,false,null);
    }

    public static <T> R<T> fail(RCode code, String message){
        return new R<T>(code,false,null);
    }

    public static <T> R<T> authFail(){
        return new R<T>(RCode.UN_AUTH,false,null);
    }

}
