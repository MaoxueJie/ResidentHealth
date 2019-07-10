package com.breeze.health.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.req.SicksQuery;
import com.breeze.health.entity.DoctorFavorites;
import com.breeze.health.entity.DoctorFavoritesExample;
import com.breeze.health.entity.custom.SickUser;
import com.breeze.health.mapper.DoctorFavoritesMapper;
import com.breeze.health.mapper.custom.UserCustomMapper;
import com.breeze.health.service.AppService;
import com.github.pagehelper.PageHelper;

@Service
public class AppServiceImpl implements AppService{
	private static Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);
	@Autowired
	UserCustomMapper userCustomMapper;
	
	@Autowired
	DoctorFavoritesMapper doctorFavoritesMapper;

	@Override
	public Result<List> getUsersPage(Long doctorId,SicksQuery query) {
		Result<List> ret = new Result<List>();
		try {
			Integer page = query.getPage();
			Integer size = query.getSize();
			if (page==null || page <1)
				page = 1;
			if (size==null || size <0)
				size = 20;
			PageHelper.startPage(page,size);
			
			Date start = null;
			Date end = null;
			if (query.getAge()!=null && query.getAge().length==2) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, -query.getAge()[1]);
				start = cal.getTime();
				cal.add(Calendar.YEAR, query.getAge()[1]);
				cal.add(Calendar.YEAR, -query.getAge()[0]);
				end = cal.getTime();
			} 
			
			List<SickUser> sickUsers = userCustomMapper.selectDoctorSicks(doctorId,query.getMobile(),query.getSex(),start,end,query.getSicks());
			
			List<Long> userIds = sickUsers.stream().map(sick->sick.getUserId()).collect(Collectors.toList());
			
			Map<Long,DoctorFavorites> favoritesMap = new HashMap<Long,DoctorFavorites>();
			DoctorFavoritesExample example = new DoctorFavoritesExample();
			example.createCriteria().andUserIdIn(userIds).andRemoveNotEqualTo(1);
			List<DoctorFavorites> favorites = doctorFavoritesMapper.selectByExample(example);
			if (favorites!=null)
			{
				for(DoctorFavorites favorite:favorites) {
					favoritesMap.put(favorite.getUserId(), favorite);
				}
			}
			if (sickUsers!=null)
			{
				for(SickUser user:sickUsers) {
					user.setInFavotires(favoritesMap.get(user.getUserId())!=null);
				}
			}
			ret.setSuccess(true);
			ret.setData(sickUsers);
		}catch(Exception e) {
			logger.error("getUsersPage exception",e);
			ret.setSuccess(false);
		}
		return ret;
	}

	@Override
	public Result<Void> addFavorites(Long doctorId, Long userId) {
		Date now = new Date();
		DoctorFavorites record = new DoctorFavorites();
		record.setDoctorId(doctorId);
		record.setUserId(userId);
		record.setRemove(0);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		doctorFavoritesMapper.insert(record);
		
		Result<Void> ret = new Result<Void>();
		ret.setSuccess(true);
		return ret;
	}

	@Override
	public Result<Void> removeFavorites(Long doctorId, Long userId) {
		Date now = new Date();
		DoctorFavoritesExample example = new DoctorFavoritesExample();
		example.createCriteria().andUserIdEqualTo(userId).andDoctorIdEqualTo(doctorId).andRemoveNotEqualTo(1);
		List<DoctorFavorites> favorites= doctorFavoritesMapper.selectByExample(example);
		if (favorites!=null)
		{
			for(DoctorFavorites favorite:favorites) {
				favorite.setUpdateTime(now);
				favorite.setRemove(1);
				doctorFavoritesMapper.updateByPrimaryKey(favorite);
			}
		}
		Result<Void> ret = new Result<Void>();
		ret.setSuccess(true);
		return ret;
	}

	@Override
	public Result<List> getFavorites(Long doctorId,Integer page,Integer size) {
		Result<List> ret = new Result<List>();
		try {
			if (page==null || page <1)
				page = 1;
			if (size==null || size <0)
				size = 20;
			PageHelper.startPage(page,size);
			List<SickUser> sickUsers = userCustomMapper.selectFavoriteSicks(doctorId);
			if (sickUsers!=null)
			{
				for(SickUser user:sickUsers) {
					user.setInFavotires(true);
				}
			}
			ret.setSuccess(true);
			ret.setData(sickUsers);
		}catch(Exception e) {
			logger.error("getFavorites exception",e);
			ret.setSuccess(false);
		}
		return ret;
	}

	@Override
	public Result<Void> checkFavorites(Long doctorId, Long userId) {
		DoctorFavoritesExample example = new DoctorFavoritesExample();
		example.createCriteria().andUserIdEqualTo(userId).andDoctorIdEqualTo(doctorId).andRemoveNotEqualTo(1);
		List<DoctorFavorites> favorites= doctorFavoritesMapper.selectByExample(example);
		Result<Void> ret = new Result<Void>();
		ret.setSuccess(favorites==null?false:favorites.size()>0);
		return ret;
	}
}
