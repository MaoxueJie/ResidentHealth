package com.breeze.health.service;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;

public interface DoctorService {
	public Result<Void> addDoctor(String mobile,String name,String jobTitle,String unit);
	public Result<DoctorVo> login(String mobile,String password);
	public Result<DoctorVo> getById(Long id);
	public Result<Void> changePwd(Long doctorId,String oldPassword,String newPassword);
}
