package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsySuicideVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;

public interface PsyService {
	public Result<Void> addOrUpdatePsy(UserPsychologicalVo vo);
	public Result<UserPsychologicalVo> getPsy(Long userId);
	
	public Result<Void> addOrUpdatePsySuicide(UserPsySuicideVo vo);
	public Result<UserPsySuicideVo> getPsySuicide(Long userId);
	
	Result<List<UserPsychologicalVo>> getPsyDate(Long userId,Integer type);
	Result<UserPsychologicalVo> getPsyById(Long id);
}
