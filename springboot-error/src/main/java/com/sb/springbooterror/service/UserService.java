/**
 * 
 */
package com.sb.springbooterror.service;

import java.util.List;

import com.sb.springbooterror.dto.Result;
import com.sb.springbooterror.dto.User;

/**
 * @author 王锐
 * @date 2018年10月17日下午3:43:32
 * @package_name com.sb.springbooterror.service
 * @project_name springboot-error
 */
public interface UserService {

	/**
	 * @author 王锐
	 * @date 2018年10月17日下午3:48:08
	 * @function TODO
	 * @return
	 * @return Result
	 * UserService
	 */
	List<User> getuserlist();

}
