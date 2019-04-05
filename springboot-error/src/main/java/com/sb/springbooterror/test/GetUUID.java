/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.UUID;

/**
 * @author 王锐
 * @date 2018年10月16日下午6:51:23
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class GetUUID {

	//获取uuid
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.err.println(uuid);
	}
}
