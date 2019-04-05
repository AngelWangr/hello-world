package com.sb.springbooterror.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.junit.Test;

public class MD5Tools {

	private String[] digitals = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

	@Test
	public void md5Encode() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//md5---------->32位的字符串
		String password="12356";
		//md5不是new出来的
		MessageDigest md5=MessageDigest.getInstance("MD5");
		byte[] bytes = md5.digest(password.getBytes("utf-8"));
		System.out.println(Arrays.toString(bytes));
		//通过每一个数字计算出两个下标[0-15]
		//int i=10/16;
		//int j=10%16;
		
		String result="";
		for (int i = 0; i < bytes.length; i++) {
			//将字节变成数字
			int num =bytes[i];
			//通过num计算出两个下标
			if (num<0) {
				num = num+256;
			}
			int j = num/16;
			int k = num%16;
			result =digitals[j] + digitals[k] + result;
		}	
		System.out.println("加密后="+result);
	}
}
