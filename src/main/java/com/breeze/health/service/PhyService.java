package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPhysiologicalVo;

public interface PhyService {
	public Result<Void> addOrUpdatePhy(UserPhysiologicalVo vo);
	
	public Result<UserPhysiologicalVo> getPhy(Long userId);
}
