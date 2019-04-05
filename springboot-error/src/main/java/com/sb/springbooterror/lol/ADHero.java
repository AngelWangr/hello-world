/**
 * 
 */
package com.sb.springbooterror.lol;

/**
 * @author 王锐
 * @date 2018年11月15日下午3:45:34
 * @package_name com.sb.springbooterror.lol
 * @project_name springboot-error
 */
public class ADHero extends Hero implements AD{

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("实现物理攻击");
	}

}
