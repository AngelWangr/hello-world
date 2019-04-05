/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Arrays;

/**
 * @author 王锐
 * @date 2018年11月20日下午4:39:24
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class BinarySearchPrectice {
	public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
 
        Arrays.sort(a);
 
        System.out.println(Arrays.toString(a));
        //  ***** 使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
    }
}
