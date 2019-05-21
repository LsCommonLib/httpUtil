package com.ls.component.library.base;

import java.io.Serializable;

/**
 * 通用响应数据对象
 *
 * @author liusheng
 */
public class HttpBean<T> implements Serializable {
    private String errorCode;
    private String errorMsg;
    private T data;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {

        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
