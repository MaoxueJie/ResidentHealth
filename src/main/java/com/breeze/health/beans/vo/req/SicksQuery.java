package com.breeze.health.beans.vo.req;

public class SicksQuery {
	String mobile;
	Integer page;
	Integer size;
	Integer[] age;
	Integer[] sicks;
	Integer sex;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer[] getAge() {
		return age;
	}
	public void setAge(Integer[] age) {
		this.age = age;
	}
	public Integer[] getSicks() {
		return sicks;
	}
	public void setSicks(Integer[] sicks) {
		this.sicks = sicks;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
}
