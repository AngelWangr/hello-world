/**
 * 
 */
package com.sb.springbooterror.test;

import java.util.Arrays;

/**
 * @author 王锐
 * @date 2018年11月20日下午4:26:33
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class CopyOfRangePrectice {
	public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
 
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 5);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
 
    }
}
