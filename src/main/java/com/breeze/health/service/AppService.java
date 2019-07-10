package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.req.SicksQuery;

public interface AppService {
	Result<List> getUsersPage(Long doctorId,SicksQuery query);
	Result<Void> addFavorites(Long doctorId,Long userId);
	Result<Void> removeFavorites(Long doctorId,Long userId);
	Result<List> getFavorites(Long doctorId,Integer page,Integer size);
}
