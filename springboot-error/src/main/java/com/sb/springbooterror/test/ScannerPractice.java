/**
 * 
 */
package com.sb.springbooterror.test;

import static org.mockito.Matchers.anyBoolean;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.Scanner;

/**
 * @author 王锐
 * @date 2018年11月15日下午2:16:37
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class ScannerPractice {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//scanner控制台输入值
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入与一个1-7的数：");
		int i = scanner.nextInt();
		//三元表达式
		String a=i < 6 ?"今个是工作日":"今个是周末";
		System.out.println(a);
		
    }
}
