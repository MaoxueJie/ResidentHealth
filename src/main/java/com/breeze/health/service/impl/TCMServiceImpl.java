package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserTCMVo;
import com.breeze.health.entity.UserPsychological;
import com.breeze.health.entity.UserPsychologicalAD8;
import com.breeze.health.entity.UserPsychologicalAD8Example;
import com.breeze.health.entity.UserPsychologicalExample;
import com.breeze.health.entity.UserPsychologicalGAD7;
import com.breeze.health.entity.UserPsychologicalGAD7Example;
import com.breeze.health.entity.UserPsychologicalPHQ9;
import com.breeze.health.entity.UserPsychologicalPHQ9Example;
import com.breeze.health.entity.UserTCM;
import com.breeze.health.entity.UserTCMExample;
import com.breeze.health.entity.UserTCMPinghe;
import com.breeze.health.entity.UserTCMPingheExample;
import com.breeze.health.entity.UserTCMQixu;
import com.breeze.health.entity.UserTCMQixuExample;
import com.breeze.health.entity.UserTCMQiyu;
import com.breeze.health.entity.UserTCMQiyuExample;
import com.breeze.health.entity.UserTCMShire;
import com.breeze.health.entity.UserTCMShireExample;
import com.breeze.health.entity.UserTCMTanshi;
import com.breeze.health.entity.UserTCMTanshiExample;
import com.breeze.health.entity.UserTCMTebing;
import com.breeze.health.entity.UserTCMTebingExample;
import com.breeze.health.entity.UserTCMXueyu;
import com.breeze.health.entity.UserTCMXueyuExample;
import com.breeze.health.entity.UserTCMYangxu;
import com.breeze.health.entity.UserTCMYangxuExample;
import com.breeze.health.entity.UserTCMYinxu;
import com.breeze.health.entity.UserTCMYinxuExample;
import com.breeze.health.mapper.UserTCMMapper;
import com.breeze.health.mapper.UserTCMPingheMapper;
import com.breeze.health.mapper.UserTCMQixuMapper;
import com.breeze.health.mapper.UserTCMQiyuMapper;
import com.breeze.health.mapper.UserTCMShireMapper;
import com.breeze.health.mapper.UserTCMTanshiMapper;
import com.breeze.health.mapper.UserTCMTebingMapper;
import com.breeze.health.mapper.UserTCMXueyuMapper;
import com.breeze.health.mapper.UserTCMYangxuMapper;
import com.breeze.health.mapper.UserTCMYinxuMapper;
import com.breeze.health.service.TCMService;
import com.breeze.health.util.BeanUtils;
import com.github.pagehelper.PageHelper;

public class TCMServiceImpl implements TCMService{
	private static Logger logger = LoggerFactory.getLogger(TCMServiceImpl.class);
	
	@Autowired
	UserTCMMapper userTCMMapper;

	@Autowired
	UserTCMPingheMapper userTCMPingheMapper;
	
	@Autowired
	UserTCMQixuMapper userTCMQixuMapper;
	
	@Autowired
	UserTCMQiyuMapper userTCMQiyuMapper;
	
	@Autowired
	UserTCMShireMapper userTCMShireMapper;
	
	@Autowired
	UserTCMTanshiMapper userTCMTanshiMapper;
	
	@Autowired
	UserTCMTebingMapper userTCMTebingMapper;
	
	@Autowired
	UserTCMXueyuMapper userTCMXueyuMapper;
	
	@Autowired
	UserTCMYangxuMapper userTCMYangxuMapper;
	
	@Autowired
	UserTCMYinxuMapper userTCMYinxuMapper;
	
	
	@Autowired
	TransactionTemplate transactionTemplate;
	
	@Override
	public Result<Void> addOrUpdateTCM(UserTCMVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			final Date now = new Date();
			
			final UserTCM tcm = new UserTCM();
			BeanUtils.copyProperties(vo, tcm);
			
			final UserTCMPinghe pinghe = new UserTCMPinghe(); 
			BeanUtils.copyProperties(vo, pinghe);
			
			final UserTCMQixu qixu = new UserTCMQixu(); 
			BeanUtils.copyProperties(vo, qixu);
			
			final UserTCMQiyu qiyu = new UserTCMQiyu(); 
			BeanUtils.copyProperties(vo, qiyu);
			
			final UserTCMShire shire = new UserTCMShire(); 
			BeanUtils.copyProperties(vo, shire);
			
			final UserTCMTanshi tanshi = new UserTCMTanshi(); 
			BeanUtils.copyProperties(vo, tanshi);
			
			final UserTCMTebing tebing = new UserTCMTebing(); 
			BeanUtils.copyProperties(vo, tebing);
			
			final UserTCMXueyu xueyu = new UserTCMXueyu(); 
			BeanUtils.copyProperties(vo, xueyu);
			
			final UserTCMYangxu yangxu = new UserTCMYangxu(); 
			BeanUtils.copyProperties(vo, yangxu);
			
			final UserTCMYinxu yinxu = new UserTCMYinxu(); 
			BeanUtils.copyProperties(vo, yinxu);
			
			ret = transactionTemplate.execute(new TransactionCallback<Result<Void>>() {
				@Override
				public Result<Void> doInTransaction(TransactionStatus arg0) {
					Result<Void> result = new Result<Void>();
					if (tcm.getId()!=null)
					{
						tcm.setUpdateTime(now);
						userTCMMapper.updateByPrimaryKeySelective(tcm);
						UserTCMPingheExample pingheExample = new UserTCMPingheExample();
						pingheExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMPinghe> pinghes = userTCMPingheMapper.selectByExample(pingheExample);
						if (pinghes.size()>0)
						{
							pinghe.setId(pinghes.get(0).getId());
							pinghe.setTcmId(tcm.getId());
							pinghe.setUpdateTime(now);
							userTCMPingheMapper.updateByPrimaryKeySelective(pinghe);
						}else
						{
							pinghe.setTcmId(tcm.getId());
							pinghe.setCreateTime(now);
							pinghe.setUpdateTime(now);
							userTCMPingheMapper.insertSelective(pinghe);
						}
						
						UserTCMQixuExample qixuExample = new UserTCMQixuExample();
						qixuExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMQixu> qixus = userTCMQixuMapper.selectByExample(qixuExample);
						if (qixus.size()>0)
						{
							qixu.setId(qixus.get(0).getId());
							qixu.setTcmId(tcm.getId());
							qixu.setUpdateTime(now);
							userTCMQixuMapper.updateByPrimaryKeySelective(qixu);
						}else
						{
							qixu.setTcmId(tcm.getId());
							qixu.setCreateTime(now);
							qixu.setUpdateTime(now);
							userTCMQixuMapper.insertSelective(qixu);
						}
						
						UserTCMQiyuExample qiyuExample = new UserTCMQiyuExample();
						qiyuExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMQiyu> qiyus = userTCMQiyuMapper.selectByExample(qiyuExample);
						if (qiyus.size()>0)
						{
							qiyu.setId(qiyus.get(0).getId());
							qiyu.setTcmId(tcm.getId());
							qiyu.setUpdateTime(now);
							userTCMQiyuMapper.updateByPrimaryKeySelective(qiyu);
						}else
						{
							qiyu.setTcmId(tcm.getId());
							qiyu.setCreateTime(now);
							qiyu.setUpdateTime(now);
							userTCMQiyuMapper.insertSelective(qiyu);
						}
						
						UserTCMShireExample shireExample = new UserTCMShireExample();
						shireExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMShire> shires = userTCMShireMapper.selectByExample(shireExample);
						if (shires.size()>0)
						{
							shire.setId(shires.get(0).getId());
							shire.setTcmId(tcm.getId());
							shire.setUpdateTime(now);
							userTCMShireMapper.updateByPrimaryKeySelective(shire);
						}else
						{
							shire.setTcmId(tcm.getId());
							shire.setCreateTime(now);
							shire.setUpdateTime(now);
							userTCMShireMapper.insertSelective(shire);
						}
						
						UserTCMTanshiExample tanshiExample = new UserTCMTanshiExample();
						tanshiExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMTanshi> tanshis = userTCMTanshiMapper.selectByExample(tanshiExample);
						if (tanshis.size()>0)
						{
							tanshi.setId(tanshis.get(0).getId());
							tanshi.setTcmId(tcm.getId());
							tanshi.setUpdateTime(now);
							userTCMTanshiMapper.updateByPrimaryKeySelective(tanshi);
						}else
						{
							tanshi.setTcmId(tcm.getId());
							tanshi.setCreateTime(now);
							tanshi.setUpdateTime(now);
							userTCMTanshiMapper.insertSelective(tanshi);
						}
						
						UserTCMTebingExample tebingExample = new UserTCMTebingExample();
						tebingExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMTebing> tebings = userTCMTebingMapper.selectByExample(tebingExample);
						if (tebings.size()>0)
						{
							tebing.setId(tebings.get(0).getId());
							tebing.setTcmId(tcm.getId());
							tebing.setUpdateTime(now);
							userTCMTebingMapper.updateByPrimaryKeySelective(tebing);
						}else
						{
							tebing.setTcmId(tcm.getId());
							tebing.setCreateTime(now);
							tebing.setUpdateTime(now);
							userTCMTebingMapper.insertSelective(tebing);
						}
						
						UserTCMXueyuExample xueyuExample = new UserTCMXueyuExample();
						xueyuExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMXueyu> xueyus = userTCMXueyuMapper.selectByExample(xueyuExample);
						if (xueyus.size()>0)
						{
							xueyu.setId(xueyus.get(0).getId());
							xueyu.setTcmId(tcm.getId());
							xueyu.setUpdateTime(now);
							userTCMXueyuMapper.updateByPrimaryKeySelective(xueyu);
						}else
						{
							xueyu.setTcmId(tcm.getId());
							xueyu.setCreateTime(now);
							xueyu.setUpdateTime(now);
							userTCMXueyuMapper.insertSelective(xueyu);
						}
						
						UserTCMYangxuExample yangxuExample = new UserTCMYangxuExample();
						yangxuExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMYangxu> yangxus = userTCMYangxuMapper.selectByExample(yangxuExample);
						if (yangxus.size()>0)
						{
							yangxu.setId(yangxus.get(0).getId());
							yangxu.setTcmId(tcm.getId());
							yangxu.setUpdateTime(now);
							userTCMYangxuMapper.updateByPrimaryKeySelective(yangxu);
						}else
						{
							yangxu.setTcmId(tcm.getId());
							yangxu.setCreateTime(now);
							yangxu.setUpdateTime(now);
							userTCMYangxuMapper.insertSelective(yangxu);
						}
						
						UserTCMYinxuExample yinxuExample = new UserTCMYinxuExample();
						yinxuExample.createCriteria().andTcmIdEqualTo(tcm.getId());
						List<UserTCMYinxu> yinxus = userTCMYinxuMapper.selectByExample(yinxuExample);
						if (yinxus.size()>0)
						{
							yinxu.setId(yinxus.get(0).getId());
							yinxu.setTcmId(tcm.getId());
							yinxu.setUpdateTime(now);
							userTCMYinxuMapper.updateByPrimaryKeySelective(yinxu);
						}else
						{
							yinxu.setTcmId(tcm.getId());
							yinxu.setCreateTime(now);
							yinxu.setUpdateTime(now);
							userTCMYinxuMapper.insertSelective(yinxu);
						}
						
					}else
					{
						tcm.setCreateTime(now);
						tcm.setUpdateTime(now);
						userTCMMapper.insertSelective(tcm);
						
						pinghe.setTcmId(tcm.getId());
						pinghe.setCreateTime(now);
						pinghe.setUpdateTime(now);
						userTCMPingheMapper.insertSelective(pinghe);
						
						qixu.setTcmId(tcm.getId());
						qixu.setCreateTime(now);
						qixu.setUpdateTime(now);
						userTCMQixuMapper.insertSelective(qixu);
						
						qiyu.setTcmId(tcm.getId());
						qiyu.setCreateTime(now);
						qiyu.setUpdateTime(now);
						userTCMQiyuMapper.insertSelective(qiyu);
						
						shire.setTcmId(tcm.getId());
						shire.setCreateTime(now);
						shire.setUpdateTime(now);
						userTCMShireMapper.insertSelective(shire);
						
						tanshi.setTcmId(tcm.getId());
						tanshi.setCreateTime(now);
						tanshi.setUpdateTime(now);
						userTCMTanshiMapper.insertSelective(tanshi);
						
						tebing.setTcmId(tcm.getId());
						tebing.setCreateTime(now);
						tebing.setUpdateTime(now);
						userTCMTebingMapper.insertSelective(tebing);
						
						xueyu.setTcmId(tcm.getId());
						xueyu.setCreateTime(now);
						xueyu.setUpdateTime(now);
						userTCMXueyuMapper.insertSelective(xueyu);
						
						yangxu.setTcmId(tcm.getId());
						yangxu.setCreateTime(now);
						yangxu.setUpdateTime(now);
						userTCMYangxuMapper.insertSelective(yangxu);
						
						yinxu.setTcmId(tcm.getId());
						yinxu.setCreateTime(now);
						yinxu.setUpdateTime(now);
						userTCMYinxuMapper.insertSelective(yinxu);
						
					}
					result.setSuccess(true);
					return result;
				}
			});
		}catch(Exception e)
		{
			logger.error("添加或更AD8异常", e);
			ret.setMessage("更新AD8失败");
		}
		return ret;
	}

	@Override
	public Result<UserTCMVo> getPsy(Long userId) {
		Result<UserTCMVo> ret = new Result<UserTCMVo>();
		try{
			UserTCMExample example = new UserTCMExample();
			example.createCriteria().andUserIdEqualTo(userId);
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List tcms = userTCMMapper.selectByExample(example);
			if (tcms!= null && tcms.size()>0)
			{
				UserTCMVo vo = new UserTCMVo();

				UserTCMPingheExample pingheExample = new UserTCMPingheExample();
				pingheExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMPinghe> pinghes = userTCMPingheMapper.selectByExample(pingheExample);
				if (pinghes!= null && pinghes.size()>0)
				{
					BeanUtils.copyProperties(pinghes.get(0), vo);
				}
				
				UserTCMQixuExample qixuExample = new UserTCMQixuExample();
				qixuExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMQixu> qixus = userTCMQixuMapper.selectByExample(qixuExample);
				if (qixus!= null && qixus.size()>0)
				{
					BeanUtils.copyProperties(qixus.get(0), vo);
				}
				
				UserTCMQiyuExample qiyuExample = new UserTCMQiyuExample();
				qiyuExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMQiyu> qiyus = userTCMQiyuMapper.selectByExample(qiyuExample);
				if (qiyus.size()>0)
				{
					BeanUtils.copyProperties(qiyus.get(0), vo);
				}
				
				UserTCMShireExample shireExample = new UserTCMShireExample();
				shireExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMShire> shires = userTCMShireMapper.selectByExample(shireExample);
				if (shires.size()>0)
				{
					BeanUtils.copyProperties(shires.get(0), vo);
				}
				
				UserTCMTanshiExample tanshiExample = new UserTCMTanshiExample();
				tanshiExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMTanshi> tanshis = userTCMTanshiMapper.selectByExample(tanshiExample);
				if (tanshis.size()>0)
				{
					BeanUtils.copyProperties(tanshis.get(0), vo);
				}
				
				UserTCMTebingExample tebingExample = new UserTCMTebingExample();
				tebingExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMTebing> tebings = userTCMTebingMapper.selectByExample(tebingExample);
				if (tebings.size()>0)
				{
					BeanUtils.copyProperties(tebings.get(0), vo);
				}
				
				UserTCMXueyuExample xueyuExample = new UserTCMXueyuExample();
				xueyuExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMXueyu> xueyus = userTCMXueyuMapper.selectByExample(xueyuExample);
				if (xueyus.size()>0)
				{
					BeanUtils.copyProperties(xueyus.get(0), vo);
				}
				
				UserTCMYangxuExample yangxuExample = new UserTCMYangxuExample();
				yangxuExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMYangxu> yangxus = userTCMYangxuMapper.selectByExample(yangxuExample);
				if (yangxus.size()>0)
				{
					BeanUtils.copyProperties(yangxus.get(0), vo);
				}
				
				UserTCMYinxuExample yinxuExample = new UserTCMYinxuExample();
				yinxuExample.createCriteria().andTcmIdEqualTo(((UserTCM)tcms.get(0)).getId());
				List<UserTCMYinxu> yinxus = userTCMYinxuMapper.selectByExample(yinxuExample);
				if (yinxus.size()>0)
				{
					BeanUtils.copyProperties(yinxus.get(0), vo);
				}
				
				BeanUtils.copyProperties(tcms.get(0), vo);

				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("未获取到中医体制");
			}
		}catch(Exception e)
		{
			logger.error("获取中医体制异常", e);
			ret.setMessage("获取中医体制异常");
		}
		return ret;
	}

}
