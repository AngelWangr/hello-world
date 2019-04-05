package com.sb.springbooterror.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sb.springbooterror.dto.EmailUtils;
import com.sb.springbooterror.exceptionHandler.MyException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试全局异常处理
 */
@RestController
@RequestMapping(value="error")
public class TestController {
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);
	
    /**
     * 异常错误处理返回错误页面
     */
    @RequestMapping("/returnHtml")
    public String testErrorReturn1() throws Exception{
        throw new Exception("请求出错!");
    }

    /**
     * 异常错误处理返回json格式
     * 根据抛出的异常类型匹配到对应的异常处理方法
     */
    @RequestMapping("/returnJson")
    public String testErrorReturn2() throws MyException {
        throw new MyException("请求出错2");
    }

    @RequestMapping("/baidu")
    public String index(ModelMap map){
        map.addAttribute("host","http://baidu.com");
        return "index";
    }
    
    @RequestMapping("/sendEmail")
    public String sendEmail() throws JsonProcessingException {
        boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[]{"962911873@qq.com"}, null, "<h3><a href='http://www.baidu.com'>百度一下，你就知道</a></h3>", null);
        return "发送邮件:" + isSend;
    }
  
    
}
