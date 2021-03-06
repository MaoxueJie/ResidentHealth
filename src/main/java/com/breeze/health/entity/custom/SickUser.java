package com.breeze.health.entity.custom;

import java.util.Date;

public class SickUser {
	private Long userId;
	private String name;
	private String mobile;
	private String gender;
	private Date birthday;
	private Date lastTime;
	private boolean inFavotires;
	private Integer age;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public boolean isInFavotires() {
		return inFavotires;
	}
	public void setInFavotires(boolean inFavotires) {
		this.inFavotires = inFavotires;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
