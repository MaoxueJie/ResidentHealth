package com.breeze.health.util.wexin;

public class ComplexButton {
	private String name;            //菜单名称
	private String type;        //菜单类型
	private String key;         //key值
	private String url;
	private ComplexButton[] sub_button;    //子级菜单
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public ComplexButton[] getSub_button(){
	    return sub_button;
	}
	public void setSub_button(ComplexButton[] sub_button) {
	    this.sub_button = sub_button;
	}
	public String getType() {
	    return type;
	}
	public void setType(String type) {
	    this.type = type;
	}
	public String getKey() {
	    return key;
	}
	public void setKey(String key) {
	    this.key = key;
	}
	public String getUrl() {
	    return url;
	}
	public void setUrl(String url) {
	    this.url = url;
	}
}
