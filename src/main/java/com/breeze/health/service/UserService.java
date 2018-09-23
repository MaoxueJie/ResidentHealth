package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;

public interface UserService {
	public Result<Void> bindWexin(String openId);
	
	public Result<Void> unbindWexin(String openId);
}
