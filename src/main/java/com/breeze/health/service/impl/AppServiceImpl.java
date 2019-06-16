package com.breeze.health.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.custom.SickUser;
import com.breeze.health.mapper.custom.UserCustomMapper;
import com.breeze.health.service.AppService;
import com.github.pagehelper.PageHelper;

@Service
public class AppServiceImpl implements AppService{
	private static Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);
	@Autowired
	UserCustomMapper userCustomMapper;

	@Override
	public Result<List> getUsersPage(Long doctorId,Integer page, Integer size) {
		Result<List> ret = new Result<List>();
		try {
			if (page==null || page <1)
				page = 1;
			if (size==null || size <0)
				size = 20;
			PageHelper.startPage(page,size);
			List<SickUser> sickUsers = userCustomMapper.select(doctorId);
			ret.setSuccess(true);
			ret.setData(sickUsers);
		}catch(Exception e) {
			logger.error("getUsersPage exception",e);
			ret.setSuccess(false);
		}
		return ret;
	}
}
