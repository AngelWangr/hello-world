/**
 * 
 */
package com.sb.springbooterror.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 王锐
 * @date 2018年11月29日下午5:58:02
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class Demo2 {

	public static void main(String[] args) {
		
		String str="2018-11-28 10:30:00";
		//String str="3123";
		boolean convertSuccess = true;
		// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
		try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess = false;
		}
		System.out.println(convertSuccess);
	}
}
