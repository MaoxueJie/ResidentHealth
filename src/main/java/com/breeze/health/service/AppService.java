package com.breeze.health.service;

import java.util.List;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.req.SicksQuery;
import com.breeze.health.entity.DoctorMsg;

public interface AppService {
	Result<List> getUsersPage(Long doctorId,Long groupId,SicksQuery query);
	Result<Void> addFavorites(Long doctorId,Long userId);
	Result<Void> removeFavorites(Long doctorId,Long userId);
	Result<List> getFavorites(Long doctorId,Integer page,Integer size);
	Result<Void> checkFavorites(Long doctorId,Long userId);
    Result<List> getDocMsgs(long doctorId,Long max,Long min,Integer page,Integer size);
    Result<DoctorMsg> getDocMsgById(long msgId);
}
