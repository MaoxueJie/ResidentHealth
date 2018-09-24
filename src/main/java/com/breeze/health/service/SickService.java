package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserSickVo;

public interface SickService {
	public Result<Void> addOrUpdateSick(UserSickVo vo);
	
	public Result<UserSickVo> getSick(Long userId);
}
