/**
 * 
 */
package com.sb.springbooterror.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.springbooterror.dto.Result;
import com.sb.springbooterror.dto.User;
import com.sb.springbooterror.service.UserService;

/**
 * @author 王锐
 * @date 2018年10月17日下午3:41:29
 * @package_name com.sb.springbooterror.Controller
 * @project_name springboot-error
 */
//@Controller
@RestController
@RequestMapping(value="/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getuserlist",method=RequestMethod.GET)
	@ResponseBody
	public Result<List<User>> getuserlist(HttpServletRequest request) throws Exception{
		Result<List<User>> result = new Result<List<User>>();
		String resource_url = request.getServletPath();
		List<User> userlist =userService.getuserlist();
		
		if (null != userlist) {
			result.setMessage("getuserlist执行成功！");
			result.setRows(userlist);
			//return result;
		} else {
			result.setCode(500);
			result.setMessage("getuserlist执行失败！");
		}		
		/*String string = "1,2";
		String[] split = string.split(",");
		String string2 = split[3];
		System.out.println("请求的路径："+resource_url);
		System.out.println(result);
		throw new Exception("请求出错!");*/
		return result;
	}
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
}
