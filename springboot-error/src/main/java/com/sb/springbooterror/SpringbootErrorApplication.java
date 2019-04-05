package com.sb.springbooterror;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring Boot中Web应用的统一异常处理
 * springboot提供了一个默认映射 /error，当处理中抛出异常之后，会转到该请求中处理，并且该请求有一个全局的错误页面用来展示异常内容
 * 也可以自己创建全局异常处理类，通过@ControllerAdvice定义统一异常处理类，@ExceptionHandler 用来定义函数针对的异常类型，最后将Exception对象和请求URL映射到error.html中
 */
@MapperScan("com.sb.springbooterror.mapper")
@EnableAutoConfiguration
@EnableScheduling  
@SpringBootApplication
public class SpringbootErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootErrorApplication.class, args);
		System.out.println("SpringBoot is start ...");
	}
}
