package com.l1nk3r.reflect;
import java.util.Date;
 
public class Student {
	
	private int stuid=1;
	public String name="l1nk3r";
	private String sex="男";
	private String type="test";
	Date birth;
	public Student() {
		super();
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String getSex() {
		return sex;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	private String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}