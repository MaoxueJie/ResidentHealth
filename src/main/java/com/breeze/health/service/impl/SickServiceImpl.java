package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.beans.vo.UserSickVo;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import com.breeze.health.entity.UserSick;
import com.breeze.health.entity.UserSickExample;
import com.breeze.health.mapper.UserSickMapper;
import com.breeze.health.service.SickService;
import com.breeze.health.util.BeanUtils;

@Service("sickService")
public class SickServiceImpl implements SickService{
	private static Logger logger = LoggerFactory.getLogger(SickServiceImpl.class);
	@Autowired
	UserSickMapper userSickMapper;
	
	@Override
	public Result<Void> addOrUpdateSick(UserSickVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserSick sick = new UserSick();
			BeanUtils.copyProperties(vo, sick);
			if (sick.getId()!=null)
			{
				sick.setUpdateTime(now);
				userSickMapper.updateByPrimaryKeySelective(sick);
			}else
			{
				sick.setCreateTime(now);
				sick.setUpdateTime(now);
				userSickMapper.insert(sick);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更新健康状况异常", e);
			ret.setMessage("更新健康状况失败");
		}
		return ret;
	}

	@Override
	public Result<UserSickVo> getSick(Long userId) {
		Result<UserSickVo> ret = new Result<UserSickVo>();
		try{
			UserSickExample example = new UserSickExample();
			example.createCriteria().andUserIdEqualTo(userId);
			List<UserSick> sicks = userSickMapper.selectByExample(example);
			if (sicks!= null && sicks.size()>0)
			{
				UserSickVo vo = new UserSickVo();
				BeanUtils.copyProperties(sicks.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无健康状况");
			}
		}catch(Exception e)
		{
			logger.error("获取健康状况异常", e);
			ret.setMessage("获取健康状况失败");
		}
		return ret;
	}

}
