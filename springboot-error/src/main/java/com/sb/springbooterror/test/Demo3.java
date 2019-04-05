package com.sb.springbooterror.test;

import java.util.HashMap;

public class Demo3 {

	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("1", 555);
		System.out.println(hashMap.get("1"));
		
	}
}
