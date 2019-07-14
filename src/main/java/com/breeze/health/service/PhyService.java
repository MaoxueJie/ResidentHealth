package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPhysiologicalVo;

public interface PhyService {
	public Result<Void> addOrUpdatePhy(UserPhysiologicalVo vo);
	public Result<UserPhysiologicalVo> getPhy(Long userId);
	Result<List<UserPhysiologicalVo>> getPhyDate(Long userId);
	Result<UserPhysiologicalVo> getPhyById(Long id);
}
