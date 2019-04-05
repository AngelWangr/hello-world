/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Arrays;

/**
 * @author 王锐
 * @date 2018年11月20日下午4:41:11
 * @package_name Arrays
 * @project_name springboot-error
 */
public class ArraysEqualsPrectice {
	//比较两个数组的内容是否一样
	//第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
	public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
 
        System.out.println(Arrays.equals(a, b));
    }
}
