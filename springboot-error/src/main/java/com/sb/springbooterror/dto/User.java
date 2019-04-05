/**
 * 
 */
package com.sb.springbooterror.dto;

import java.sql.Date;

/**
 * @author 王锐
 * @date 2018年10月17日下午3:49:44
 * @package_name com.sb.springbooterror.dto
 * @project_name springboot-error
 */
public class User {

	private Integer uid;
	private String name;
	private String sex;
	private Date birthday;
	public User() {
		super();
	}
	public User(Integer uid, String name, String sex, Date birthday) {
		super();
		this.uid = uid;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + "]";
	}
	
}
