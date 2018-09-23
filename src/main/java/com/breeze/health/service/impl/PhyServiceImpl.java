package com.breeze.health.service.impl;

import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.service.PhyService;

@Service("phyService")
public class PhyServiceImpl implements PhyService{

	@Override
	public Result<Void> addOrUpdatePhy(UserPhysiologicalVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<UserPhysiologicalVo> getPhy(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
