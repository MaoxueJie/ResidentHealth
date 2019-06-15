package com.breeze.health.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.Doctor;
import com.breeze.health.entity.DoctorExample;
import com.breeze.health.mapper.DoctorMapper;
import com.breeze.health.service.DoctorService;
import com.breeze.health.util.BeanUtils;
import com.breeze.health.util.MD5Util;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService{
	private static Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);
	@Autowired
	private DoctorMapper doctorMapper;
	
	@Override
	public Result<DoctorVo> login(String mobile, String password) {
		Result<DoctorVo> ret = new Result<DoctorVo>();
		try {
			DoctorExample example = new DoctorExample();
			example.createCriteria().andMobileEqualTo(mobile);
			List<Doctor> doctors = doctorMapper.selectByExample(example);
			if (doctors!=null && doctors.size()>0) {
				if (doctors.get(0).getPassword().equals(MD5Util.hash(password)))
				{
					DoctorVo data = new DoctorVo();
					BeanUtils.copyProperties(doctors.get(0), data);
					ret.setSuccess(true);
					ret.setData(data);
				}else
				{
					ret.setSuccess(false);
				}
			}
		}catch(Exception e) {
			ret.setSuccess(false);
			logger.error("login exception", e);
		}
		return ret;
	}

	@Override
	public Result<DoctorVo> getById(Long id) {
		Result<DoctorVo> ret = new Result<DoctorVo>();
		try {
		    Doctor doctor = doctorMapper.selectByPrimaryKey(id);
		    System.out.println("docker----------------"+doctor);
			if (doctor!=null) {
				DoctorVo data = new DoctorVo();
				BeanUtils.copyProperties(doctor, data);
				ret.setSuccess(true);
				ret.setData(data);
			}else
			{
				ret.setSuccess(false);
			}
		}catch(Exception e) {
			ret.setSuccess(false);
			logger.error("getById exception", e);
		}
		return ret;
	}

}
