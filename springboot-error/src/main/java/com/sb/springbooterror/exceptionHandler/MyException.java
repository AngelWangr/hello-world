package com.sb.springbooterror.exceptionHandler;

/**
 * 自定义异常类，继承exception
 * 用于测试
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
