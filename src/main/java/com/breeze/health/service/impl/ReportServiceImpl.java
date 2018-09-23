package com.breeze.health.service.impl;

import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserReportVo;
import com.breeze.health.service.ReportService;

@Service("reportService")
public class ReportServiceImpl implements ReportService{

	@Override
	public Result<UserReportVo> getReprot(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
