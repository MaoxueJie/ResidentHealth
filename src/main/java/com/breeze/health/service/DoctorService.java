package com.breeze.health.service;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;

public interface DoctorService {
	public Result<DoctorVo> login(String mobile,String password);
	public Result<DoctorVo> getById(Integer id);
}
