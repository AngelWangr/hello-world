/**
 * 
 */
package com.sb.springbooterror.lol;

/**
 * @author 王锐
 * @date 2018年11月15日上午11:00:58
 * @package_name com.sb.springbooterror.lol
 * @project_name springboot-error
 */
public class Hero {

	//姓名
	private String name;
	//血量
	private float hp;
	//护甲
	private float armor;
	//移动速度
	private int movespeed;
	public Hero() {
		super();
	}
	public Hero(String name, float hp, float armor, int movespeed) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.movespeed = movespeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHp() {
		return hp;
	}
	public void setHp(float hp) {
		this.hp = hp;
	}
	public float getArmor() {
		return armor;
	}
	public void setArmor(float armor) {
		this.armor = armor;
	}
	public int getMovespeed() {
		return movespeed;
	}
	public void setMovespeed(int movespeed) {
		this.movespeed = movespeed;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", armor=" + armor + ", movespeed=" + movespeed + "]";
	}
	
	
}
