/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author 王锐
 * @date 2018年10月22日下午2:28:47
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class ListToString {

	//集合list转string，以逗号分隔
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");
		String citiesCommaSeparated = String.join(",", cities);
		System.out.println(citiesCommaSeparated);
	}
}
