package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserTCMVo;
import com.breeze.health.entity.UserTCM;

public interface TCMService {
	public Result<Void> addOrUpdateTCM(UserTCMVo vo);
	public Result<UserTCMVo> getTCM(Long userId);
}
