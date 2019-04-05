/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sb.springbooterror.dto.User;
import com.sb.springbooterror.service.UserService;

/**
 * @author 王锐
 * @date 2018年11月15日下午5:14:39
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
@Component  
public class Scheduler {

	@Autowired
	private UserService userService;
	
	 @Scheduled(cron="0 0/1 * * * ?")
	 public void statusCheck() {
		 System.out.println("每分钟执行一次。开始……");
		 List<User> userlist =userService.getuserlist();
		 System.out.println(userlist+"====");
		 System.out.println("每分钟执行一次。结束。");
	 }
}
