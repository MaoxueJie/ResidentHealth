package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsychologicalAD8Vo;
import com.breeze.health.beans.vo.UserPsychologicalGAD7Vo;
import com.breeze.health.beans.vo.UserPsychologicalPHQ9Vo;
import com.breeze.health.entity.UserPsychologicalAD8;
import com.breeze.health.entity.UserPsychologicalAD8Example;
import com.breeze.health.entity.UserPsychologicalGAD7;
import com.breeze.health.entity.UserPsychologicalGAD7Example;
import com.breeze.health.entity.UserPsychologicalPHQ9;
import com.breeze.health.entity.UserPsychologicalPHQ9Example;
import com.breeze.health.mapper.UserPsychologicalAD8Mapper;
import com.breeze.health.mapper.UserPsychologicalGAD7Mapper;
import com.breeze.health.mapper.UserPsychologicalPHQ9Mapper;
import com.breeze.health.service.PsyService;
import com.breeze.health.util.BeanUtils;

@Service("psyService")
public class PsyServiceImpl implements PsyService{
	private static Logger logger = LoggerFactory.getLogger(PsyServiceImpl.class);
	
	@Autowired
	UserPsychologicalAD8Mapper userPsychologicalAD8Mapper;
	
	@Autowired
	UserPsychologicalPHQ9Mapper userPsychologicalPHQ9Mapper;
	
	@Autowired
	UserPsychologicalGAD7Mapper userPsychologicalGAD7Mapper;
	
	@Override
	public Result<Void> addOrUpdatePsyAD8(UserPsychologicalAD8Vo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPsychologicalAD8 ad8 = new UserPsychologicalAD8();
			BeanUtils.copyProperties(vo, ad8);
			int score = 0;
			if(ad8.getQ1()!=null && ad8.getQ1()==2)
			{
				score += 1;
			}
			if(ad8.getQ2()!=null && ad8.getQ2()==2)
			{
				score += 1;
			}
			if(ad8.getQ3()!=null && ad8.getQ3()==2)
			{
				score += 1;
			}
			if(ad8.getQ4()!=null && ad8.getQ4()==2)
			{
				score += 1;
			}
			if(ad8.getQ5()!=null && ad8.getQ5()==2)
			{
				score += 1;
			}
			if(ad8.getQ6()!=null && ad8.getQ6()==2)
			{
				score += 1;
			}
			if(ad8.getQ7()!=null && ad8.getQ7()==2)
			{
				score += 1;
			}
			if(ad8.getQ8()!=null && ad8.getQ8()==2)
			{
				score += 1;
			}
			ad8.setScore(score);
			if (ad8.getId()!=null)
			{
				ad8.setUpdateTime(now);
				userPsychologicalAD8Mapper.updateByPrimaryKeySelective(ad8);
			}else
			{
				ad8.setCreateTime(now);
				ad8.setUpdateTime(now);
				userPsychologicalAD8Mapper.insert(ad8);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更AD8异常", e);
			ret.setMessage("更新AD8失败");
		}
		return ret;
	}

	@Override
	public Result<UserPsychologicalAD8Vo> getPsyAd8(Long userId) {
		Result<UserPsychologicalAD8Vo> ret = new Result<UserPsychologicalAD8Vo>();
		try{
			UserPsychologicalAD8Example example = new UserPsychologicalAD8Example();
			example.createCriteria().andUserIdEqualTo(userId);
			List<UserPsychologicalAD8> ad8s = userPsychologicalAD8Mapper.selectByExample(example);
			if (ad8s!= null && ad8s.size()>0)
			{
				UserPsychologicalAD8Vo vo = new UserPsychologicalAD8Vo();
				BeanUtils.copyProperties(ad8s.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无AD8");
			}
		}catch(Exception e)
		{
			logger.error("获取AD8异常", e);
			ret.setMessage("获取AD8失败");
		}
		return ret;
	}

	@Override
	public Result<Void> addOrUpdatePsyGAD7(UserPsychologicalGAD7Vo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPsychologicalGAD7 gad7 = new UserPsychologicalGAD7();
			BeanUtils.copyProperties(vo, gad7);
			int score = 0;
			if (gad7.getQ1()!=null)
			{
				score += gad7.getQ1();
			}
			if (gad7.getQ2()!=null)
			{
				score += gad7.getQ2();
			}
			if (gad7.getQ3()!=null)
			{
				score += gad7.getQ3();
			}
			if (gad7.getQ4()!=null)
			{
				score += gad7.getQ4();
			}
			if (gad7.getQ5()!=null)
			{
				score += gad7.getQ5();
			}
			if (gad7.getQ6()!=null)
			{
				score += gad7.getQ6();
			}
			if (gad7.getQ7()!=null)
			{
				score += gad7.getQ7();
			}

			gad7.setScore(score);
			if (gad7.getId()!=null)
			{
				gad7.setUpdateTime(now);
				userPsychologicalGAD7Mapper.updateByPrimaryKeySelective(gad7);
			}else
			{
				gad7.setCreateTime(now);
				gad7.setUpdateTime(now);
				userPsychologicalGAD7Mapper.insert(gad7);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更GAD7异常", e);
			ret.setMessage("更新GAD7失败");
		}
		return ret;
	}

	@Override
	public Result<UserPsychologicalGAD7Vo> getPsyGAD7(Long userId) {
		Result<UserPsychologicalGAD7Vo> ret = new Result<UserPsychologicalGAD7Vo>();
		try{
			UserPsychologicalGAD7Example example = new UserPsychologicalGAD7Example();
			example.createCriteria().andUserIdEqualTo(userId);
			List<UserPsychologicalGAD7> gad7s = userPsychologicalGAD7Mapper.selectByExample(example);
			if (gad7s!= null && gad7s.size()>0)
			{
				UserPsychologicalGAD7Vo vo = new UserPsychologicalGAD7Vo();
				BeanUtils.copyProperties(gad7s.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无GAD7");
			}
		}catch(Exception e)
		{
			logger.error("获取GAD7异常", e);
			ret.setMessage("获取GAD7失败");
		}
		return ret;
	}

	@Override
	public Result<Void> addOrUpdatePsyPHQ9(UserPsychologicalPHQ9Vo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPsychologicalPHQ9 phq9 = new UserPsychologicalPHQ9();
			BeanUtils.copyProperties(vo, phq9);
			int score = 0;
			if (phq9.getQ1()!=null)
			{
				score += phq9.getQ1();
			}
			if (phq9.getQ2()!=null)
			{
				score += phq9.getQ2();
			}
			if (phq9.getQ3()!=null)
			{
				score += phq9.getQ3();
			}
			if (phq9.getQ4()!=null)
			{
				score += phq9.getQ4();
			}
			if (phq9.getQ5()!=null)
			{
				score += phq9.getQ5();
			}
			if (phq9.getQ6()!=null)
			{
				score += phq9.getQ6();
			}
			if (phq9.getQ7()!=null)
			{
				score += phq9.getQ7();
			}
			if (phq9.getQ8()!=null)
			{
				score += phq9.getQ8();
			}
			if (phq9.getQ9()!=null)
			{
				score += phq9.getQ9();
			}

			phq9.setScore(score);
			if (phq9.getId()!=null)
			{
				phq9.setUpdateTime(now);
				userPsychologicalPHQ9Mapper.updateByPrimaryKeySelective(phq9);
			}else
			{
				phq9.setCreateTime(now);
				phq9.setUpdateTime(now);
				userPsychologicalPHQ9Mapper.insert(phq9);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更PHQ9异常", e);
			ret.setMessage("更新PHQ9失败");
		}
		return ret;
	}

	@Override
	public Result<UserPsychologicalPHQ9Vo> getPsyPHQ9(Long userId) {
		Result<UserPsychologicalPHQ9Vo> ret = new Result<UserPsychologicalPHQ9Vo>();
		try{
			UserPsychologicalPHQ9Example example = new UserPsychologicalPHQ9Example();
			example.createCriteria().andUserIdEqualTo(userId);
			List<UserPsychologicalPHQ9> phq9s = userPsychologicalPHQ9Mapper.selectByExample(example);
			if (phq9s!= null && phq9s.size()>0)
			{
				UserPsychologicalPHQ9Vo vo = new UserPsychologicalPHQ9Vo();
				BeanUtils.copyProperties(phq9s.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("无PHQ9");
			}
		}catch(Exception e)
		{
			logger.error("获取PHQ9异常", e);
			ret.setMessage("获取PHQ9失败");
		}
		return ret;
	}

}
