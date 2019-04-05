/**
 * 
 */
package com.sb.springbooterror.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sb.springbooterror.dto.User;

/**
 * @author 王锐
 * @date 2018年10月17日下午3:44:34
 * @package_name com.sb.springbooterror.mapper
 * @project_name springboot-error
 */
//@Repository
public interface UserMapper {

	/**
	 * @author 王锐
	 * @date 2018年10月17日下午3:51:03
	 * @function TODO
	 * @return
	 * @return List<User>
	 * UserMapper
	 */
	List<User> getuserlist();

}
