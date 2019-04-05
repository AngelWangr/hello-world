/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Scanner;

/**
 * @author 王锐
 * @date 2018年11月6日下午6:49:48
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class SwitchPractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int i = scanner.nextInt();
		switch (i) {
		case 1:
		case 2:
		case 3:
			System.out.println("春天");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("夏天");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("秋天");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬天");
			break;
		default:
			break;
		}
	}
}
