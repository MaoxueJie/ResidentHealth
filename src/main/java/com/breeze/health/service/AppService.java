package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.req.SicksQuery;

public interface AppService {
	Result<List> getUsersPage(Long doctorId,SicksQuery query);
}
