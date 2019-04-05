/**
 * 
 */
package com.sb.springbooterror.test;

/**
 * @author 王锐
 * @date 2018年11月20日下午2:49:46
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class DoWhilePractice {

	public static void main(String[] args) {
        
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int i = 0;
        do{
            System.out.println(i);
            i++;           
        } while(i<-1);
         
    }
}
