package com.sb.springbooterror.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {

	// 这段代码，会抛出 文件不存在异常 FileNotFoundException 和 解析异常ParseException
	// 解决办法之一是分别进行catch
	public static void main(String[] args) {

		File f = new File("C:/Users/DF/Desktop/debug.log");

		try {
			System.out.println("试图打开 C:/Users/DF/Desktop/debug.log");
			new FileInputStream(f);
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2016-06-03");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("日期格式解析错误");
			e.printStackTrace();
		} finally {
			System.out.println("无论文件是否存在， 都会执行的代码");
		}

		//跟上面不同，这调用method1
		
		//method2中需要进行异常处理
		//但是method2不打算处理，而是把这个异常通过throws抛出去
		//那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。
		//method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
		
		method1();

	}

	private static void method1() {
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void method2() throws FileNotFoundException {

		File f = new File("d:/LOL.exe");

		System.out.println("试图打开 d:/LOL.exe");
		new FileInputStream(f);
		System.out.println("成功打开");

	}
}