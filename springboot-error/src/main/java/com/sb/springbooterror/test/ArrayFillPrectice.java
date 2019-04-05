/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Arrays;

/**
 * @author 王锐
 * @date 2018年11月20日下午4:42:35
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class ArrayFillPrectice {
	//使用同一个值，填充整个数组
	public static void main(String[] args) {
        int a[] = new int[10];
  
        Arrays.fill(a, 5);
  
        System.out.println(Arrays.toString(a));
  
    }
}
