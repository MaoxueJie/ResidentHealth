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
import com.breeze.health.entity.DoctorMsg;
import com.breeze.health.entity.DoctorMsgExample;
import com.breeze.health.entity.custom.SickUser;
import com.breeze.health.mapper.DoctorFavoritesMapper;
import com.breeze.health.mapper.DoctorMsgMapper;
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
	
	@Autowired
	DoctorMsgMapper doctorMsgMapper;

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
			Date now = new Date();
			if (sickUsers!=null)
			{
				for(SickUser user:sickUsers) {
					user.setInFavotires(favoritesMap.get(user.getUserId())!=null);
					if(user.getBirthday()!=null) {
						user.setAge(getAgeByBirth(user.getBirthday()));
					}
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
					if(user.getBirthday()!=null) {
						user.setAge(getAgeByBirth(user.getBirthday()));
					}
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
	
	public static Integer getAgeByBirth(Date birthday){        
        //Calendar：日历
        /*从Calendar对象中或得一个Date对象*/
        Calendar cal = Calendar.getInstance();
        /*把出生日期放入Calendar类型的bir对象中，进行Calendar和Date类型进行转换*/
         Calendar bir = Calendar.getInstance();
         bir.setTime(birthday);
         /*如果生日大于当前日期，则抛出异常：出生日期不能大于当前日期*/
         if(cal.before(birthday)){
             return null;
         }
         /*取出当前年月日*/
         int yearNow = cal.get(Calendar.YEAR);
         int monthNow = cal.get(Calendar.MONTH);
        int dayNow = cal.get(Calendar.DAY_OF_MONTH);
         /*取出出生年月日*/
         int yearBirth = bir.get(Calendar.YEAR);
         int monthBirth = bir.get(Calendar.MONTH);
         int dayBirth = bir.get(Calendar.DAY_OF_MONTH);
         /*大概年龄是当前年减去出生年*/
         int age = yearNow - yearBirth;
         /*如果出当前月小与出生月，或者当前月等于出生月但是当前日小于出生日，那么年龄age就减一岁*/
         if(monthNow < monthBirth || (monthNow == monthBirth && dayNow < dayBirth)){
             age--;
         }
         return age;
     }

	@Override
	public Result<List> getDocMsgs(long doctorId,Long max,Integer page,Integer size) {
		Result<List> ret = new Result<List>();
		try {
			if (page==null || page <1)
				page = 1;
			if (size==null || size <0)
				size = 10;
			PageHelper.startPage(page,size);
			DoctorMsgExample example = new DoctorMsgExample();
			example.createCriteria().andDoctorIdEqualTo(doctorId);
			if (max!=null)
			{
				example.getOredCriteria().get(0).andIdLessThanOrEqualTo(max);
			}
			example.setOrderByClause(" id desc ");
			List<DoctorMsg> msgs = doctorMsgMapper.selectByExample(example);
			ret.setSuccess(true);
			ret.setData(msgs);
		}catch(Exception e) {
			logger.error("getDocMsgs exception",e);
			ret.setSuccess(false);
		}
		return ret;
		
	}

	@Override
	public Result<DoctorMsg> getDocMsgById(long msgId) {
		Result<DoctorMsg> ret = new Result<DoctorMsg>();
		try {
			DoctorMsg msg = doctorMsgMapper.selectByPrimaryKey(msgId);
			if (msg!=null && msg.getStatus()==0)
			{
				msg.setStatus(1);
				msg.setUpdateTime(new Date());
				doctorMsgMapper.updateByPrimaryKeySelective(msg);
			}
			ret.setSuccess(true);
			ret.setData(msg);
		}catch(Exception e) {
			logger.error("getDocMsgById exception",e);
			ret.setSuccess(false);
		}
		return ret;
	}
}
