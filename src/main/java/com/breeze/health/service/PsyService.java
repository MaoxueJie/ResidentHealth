package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsychologicalAD8Vo;
import com.breeze.health.beans.vo.UserPsychologicalGAD7Vo;
import com.breeze.health.beans.vo.UserPsychologicalPHQ9Vo;

public interface PsyService {
	public Result<Void> addOrUpdatePsyAD8(UserPsychologicalAD8Vo vo);
	public Result<UserPsychologicalAD8Vo> getPsyAd8(Long userId);
	public Result<Void> addOrUpdatePsyGAD7(UserPsychologicalGAD7Vo vo);
	public Result<UserPsychologicalGAD7Vo> getPsyGAD7(Long userId);
	public Result<Void> addOrUpdatePsyPHQ9(UserPsychologicalPHQ9Vo vo);
	public Result<UserPsychologicalPHQ9Vo> getPsyPHQ9(Long userId);
}
