/**
 * 
 */
package com.sb.springbooterror.test;

import static org.mockito.Matchers.eq;

import java.util.Scanner;

/**
 * @author 王锐
 * @date 2018年11月20日下午2:48:14
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class WhilePractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        
        //1,打印0到4    
       /* int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }*/
		// 通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num = sc.nextInt();
        int n = num;
        int sum = 1;
        while (n > 0) {
            sum *= n;
            n--;//n -= 1;
        }
        System.out.println(num+"的阶乘是： "+sum);
    }
}
