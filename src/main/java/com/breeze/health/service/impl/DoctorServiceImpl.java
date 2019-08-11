package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.config.Config;
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
			if (doctor!=null) {
				DoctorVo data = new DoctorVo();
				BeanUtils.copyProperties(doctor, data);
				data.setQr(java.net.URLEncoder.encode(Config.getBasepath()+"wechatMenu/doctor-"+data.getId()));
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

	@Override
	public Result<Void> changePwd(Long doctorId, String oldPassword, String newPassword) {
		Result<Void> ret = new Result<Void>();
		try {
		    Doctor doctor = doctorMapper.selectByPrimaryKey(doctorId);
			if (doctor!=null) {
				if (doctor.getPassword().equals(MD5Util.hash(oldPassword)))
				{
					doctor.setPassword(MD5Util.hash(newPassword));
					doctor.setUpdateTime(new Date());
					doctorMapper.updateByPrimaryKeySelective(doctor);
					ret.setSuccess(true);
				}else
				{
					ret.setSuccess(false);
					ret.setMessage("原密码不正确！");
				}
			}else
			{
				ret.setSuccess(false);
				ret.setMessage("修改密码失败！");
			}
		}catch(Exception e) {
			ret.setSuccess(false);
			ret.setMessage("系统正忙，请联系管理员！");
			logger.error("changePwd exception", e);
		}
		return ret;
	}

	@Override
	public Result<Void> addDoctor(String mobile,String name,String jobTitle, String unit) {
		Result<Void> ret = new Result<Void>();
		try {
			DoctorExample example = new DoctorExample();
			example.createCriteria().andMobileEqualTo(mobile);
			int count = doctorMapper.countByExample(example);
			if (count==0)
			{
				Date now = new Date();
				Doctor doctor = new Doctor();
				doctor.setAdmin(0);
				doctor.setMobile(mobile);
				doctor.setPassword(MD5Util.hash("1111"));
				doctor.setName(name);
				doctor.setUnit(unit);
				doctor.setJobTitle(jobTitle);
				doctor.setUpdateTime(now);
				doctor.setCreateTime(now);
				doctorMapper.insert(doctor);
				ret.setSuccess(true);
			}else {
				ret.setSuccess(false);
				ret.setMessage("添加失败");
			}
		}catch(Exception e) {
			ret.setSuccess(false);
			ret.setMessage("系统异常");
			logger.error("changePwd exception", e);
		}
		return ret;
	}

}
