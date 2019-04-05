/**
 * 
 */
package com.sb.springbooterror.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.springbooterror.dto.Result;
import com.sb.springbooterror.dto.User;
import com.sb.springbooterror.mapper.UserMapper;
import com.sb.springbooterror.service.UserService;

/**
 * @author 王锐
 * @date 2018年10月17日下午3:44:02
 * @package_name com.sb.springbooterror.service.impl
 * @project_name springboot-error
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getuserlist() {
		// TODO Auto-generated method stub
		
		List<User> userlist=userMapper.getuserlist();
			
		return userlist;
	}
}
