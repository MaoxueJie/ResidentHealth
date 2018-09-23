package com.breeze.health.service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserReportVo;

public interface ReportService {
	public Result<UserReportVo> getReprot(Long userId);
}
