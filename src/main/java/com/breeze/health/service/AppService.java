package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;

public interface AppService {
	Result<List> getUsersPage(Long doctorId,Integer page,Integer size);
}
