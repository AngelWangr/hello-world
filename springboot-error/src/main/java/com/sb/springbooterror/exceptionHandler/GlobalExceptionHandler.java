package com.sb.springbooterror.exceptionHandler;

import com.sb.springbooterror.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 * 通过使用@ControllerAdvice定义统一的异常处理类，可以不用在每个Controller中逐个定义异常处理方式
 * @ExceptionHandler 用来定义函数针对的异常类型，controller通过抛出的异常类型匹配
 * 最后将Exception对象和请求URL映射到 resource/templates/error.html中
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //默认异常处理页面
    public static final String DEFAUL_ERROR_VIEW = "error";

    /**
     * 默认异常处理方法,返回异常请求路径和异常信息
     */
    /*@ExceptionHandler(value = Exception.class)
    public ModelAndView defaulErrorHandler(HttpServletRequest request,Exception e) throws  Exception{

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);                   //异常信息
        mav.addObject("url","请求路径：" + request.getRequestURI());   //异常请求路径
        mav.setViewName(DEFAUL_ERROR_VIEW);                          //返回异常处理页面
        return mav;
    }*/

    
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> defaulErrorHandler(HttpServletRequest request,Exception e) throws  Exception{

    	ErrorInfo<String> error = new ErrorInfo<>();
        //ModelAndView mav = new ModelAndView();
        error.setCode(ErrorInfo.ERROR);
        error.setMessage(e.toString());
        error.setUrl(request.getRequestURI());
        return error;
    }
    
    /**
     * @ExceptionHandler 匹配抛出的异常类型
     * ErrorInfo<String> 为自定义的一个数据封装类，用于返回的json数据
     * 如果返回的是json格式，需要加上@ResponsBody
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request,MyException e) throws Exception{

        ErrorInfo<String> error = new ErrorInfo<>();
        error.setCode(ErrorInfo.ERROR);
        error.setMessage(e.getMessage());
        error.setUrl(request.getRequestURI());
        error.setData("未知错误");
        return error;
    }

}
