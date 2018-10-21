package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserVo;

public interface UserService {
	public Result<Void> bindWexin(String openId);
	
	public Result<Void> unbindWexin(String openId);
	
	public Result<Void> addOrUpdateBaseInfo(UserBaseInfoVo vo);
	
	public Result<UserBaseInfoVo> getBaseInfo(Long userId);
	
	public Result<UserVo> getUserByOpenId(String openId);
	
	public Result<UserVo> getUserById(Long userId);
	
	public Result<UserVo> loginOrRegister(String mobile,String verificationCode);
	
	public Result<String> sendVertificationCode(String mobile);
	
}
