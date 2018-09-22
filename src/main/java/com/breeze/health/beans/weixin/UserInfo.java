package com.breeze.health.beans.weixin;

import java.util.List;

/**
 * 微信用户信息�?
 * @author dxw
 */
public class UserInfo
{

    // 关注状�?�?是关注，0是未关注），未关注时获取不到其余信息
    private String subscribe;
    // 用户的标�?
    private String openid;
    // 昵称
    private String nickname;
    // 用户的�?别（1是男性，2是女性，0是未知）
    private String sex;
    // 用户的语�?���?��中文为zh_CN
    private String language;
    // 用户�?��城市
    private String city;
    // 用户�?��国家
    private String country;
    // 用户头像
    private String headimgurl;
    // 用户关注时间，为时间戳�?如果用户曾多次关注，则取�?��关注时间
    private String subscribe_time;
    // 用户�?��省份
    private String province;
    private String unionid;
    private String remark;
    private String groupid;
    private List<String> tagid_list;
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getSubscribe_time() {
		return subscribe_time;
	}
	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public List<String> getTagid_list() {
		return tagid_list;
	}
	public void setTagid_list(List<String> tagid_list) {
		this.tagid_list = tagid_list;
	}

    

}
