package com.sb.springbooterror.dto;

/**
 * 作为错误返回的json封装对象
 */
public class ErrorInfo<T> {
    public static final Integer OK = 0;
    public static final Integer ERROR = 500;

    private Integer code;       //消息类型
    private String message;     //消息内容
    private String url;         //请求路径
    private T data;             //返回数据

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static Integer getOK() {
        return OK;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
