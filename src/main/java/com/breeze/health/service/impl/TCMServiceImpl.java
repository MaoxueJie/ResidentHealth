package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserTCMVo;
import com.breeze.health.entity.User;
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
import com.breeze.health.mapper.UserMapper;
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
@Service("tcmService")
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
	UserMapper userMapper;
	
	@Autowired
	TransactionTemplate transactionTemplate;
	
	@Override
	public Result<Void> addOrUpdateTCM(UserTCMVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			final Date now = new Date();
			
			final UserTCM tcm = new UserTCM();
			BeanUtils.copyProperties(vo, tcm);
			int orial = 0;
			
			final UserTCMPinghe pinghe = new UserTCMPinghe(); 
			BeanUtils.copyProperties(vo, pinghe);
			orial = null2zero(pinghe.getPingheQ1()) - null2zero(pinghe.getPingheQ2()) - null2zero(pinghe.getPingheQ3()) - null2zero(pinghe.getPingheQ4())-null2zero(pinghe.getPingheQ5())+ null2zero(pinghe.getPingheQ6())-null2zero(pinghe.getPingheQ7())-null2zero(pinghe.getPingheQ8()) + 36;
			pinghe.setPingheScore(Math.round(((orial-8)*100)/32f));
			
			final UserTCMQixu qixu = new UserTCMQixu(); 
			BeanUtils.copyProperties(vo, qixu);
			orial = null2zero(qixu.getQixuQ1())+null2zero(qixu.getQixuQ2())+null2zero(qixu.getQixuQ3())+null2zero(qixu.getQixuQ4())+null2zero(qixu.getQixuQ5())+null2zero(qixu.getQixuQ6())+null2zero(qixu.getQixuQ7())+null2zero(qixu.getQixuQ8());
			qixu.setQixuScore(Math.round(((orial-8)*100)/32f));
			
			final UserTCMQiyu qiyu = new UserTCMQiyu(); 
			BeanUtils.copyProperties(vo, qiyu);
			orial = null2zero(qiyu.getQiyuQ1()) + null2zero(qiyu.getQiyuQ2()) + null2zero(qiyu.getQiyuQ3()) + null2zero(qiyu.getQiyuQ4()) + null2zero(qiyu.getQiyuQ5()) + null2zero(qiyu.getQiyuQ6()) + null2zero(qiyu.getQiyuQ7());
			qiyu.setQiyuScore(Math.round(((orial-7)*100)/28f));
			
			final UserTCMShire shire = new UserTCMShire(); 
			BeanUtils.copyProperties(vo, shire);
			orial = null2zero(shire.getShireQ1()) + null2zero(shire.getShireQ2())+ null2zero(shire.getShireQ3())+ null2zero(shire.getShireQ4())+ null2zero(shire.getShireQ5())+ null2zero(shire.getShireQ6())+ null2zero(shire.getShireQ7());
			shire.setShireScore(Math.round(((orial-6)*100)/24f));
			
			final UserTCMTanshi tanshi = new UserTCMTanshi(); 
			BeanUtils.copyProperties(vo, tanshi);
			orial =null2zero(tanshi.getTanshiQ1()) + null2zero(tanshi.getTanshiQ2()) + null2zero(tanshi.getTanshiQ3()) + null2zero(tanshi.getTanshiQ4()) + null2zero(tanshi.getTanshiQ5()) + null2zero(tanshi.getTanshiQ6()) + null2zero(tanshi.getTanshiQ7()) + null2zero(tanshi.getTanshiQ8());
			tanshi.setTanshiScore(Math.round(((orial-8)*100)/32f));
			
			final UserTCMTebing tebing = new UserTCMTebing(); 
			BeanUtils.copyProperties(vo, tebing);
			orial =null2zero(tebing.getTebingQ1()) + null2zero(tebing.getTebingQ2()) + null2zero(tebing.getTebingQ3()) + null2zero(tebing.getTebingQ4()) + null2zero(tebing.getTebingQ5()) + null2zero(tebing.getTebingQ6()) + null2zero(tebing.getTebingQ7());
			tebing.setTebingScore(Math.round(((orial-7)*100)/28f));
			
			final UserTCMXueyu xueyu = new UserTCMXueyu(); 
			BeanUtils.copyProperties(vo, xueyu);
			orial = null2zero(xueyu.getXueyuQ1()) + null2zero(xueyu.getXueyuQ2()) + null2zero(xueyu.getXueyuQ3()) + null2zero(xueyu.getXueyuQ4()) + null2zero(xueyu.getXueyuQ5()) + null2zero(xueyu.getXueyuQ6()) + null2zero(xueyu.getXueyuQ7());
			xueyu.setXueyuScore(Math.round(((orial-7)*100)/28f));
			
			final UserTCMYangxu yangxu = new UserTCMYangxu(); 
			BeanUtils.copyProperties(vo, yangxu);
			orial =null2zero(yangxu.getYangxuQ1()) + null2zero(yangxu.getYangxuQ2()) + null2zero(yangxu.getYangxuQ3())+ null2zero(yangxu.getYangxuQ4())+ null2zero(yangxu.getYangxuQ5())+ null2zero(yangxu.getYangxuQ6())+ null2zero(yangxu.getYangxuQ7());
			yangxu.setYangxuScore(Math.round(((orial-7)*100)/28f));
			
			final UserTCMYinxu yinxu = new UserTCMYinxu(); 
			BeanUtils.copyProperties(vo, yinxu);
			orial =null2zero(yinxu.getYinxuQ1()) + null2zero(yinxu.getYinxuQ2()) + null2zero(yinxu.getYinxuQ3()) + null2zero(yinxu.getYinxuQ4()) + null2zero(yinxu.getYinxuQ5()) + null2zero(yinxu.getYinxuQ6()) + null2zero(yinxu.getYinxuQ7()) + null2zero(yinxu.getYinxuQ8());
			yinxu.setYinxuScore(Math.round(((orial-8)*100)/32f));
			
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
					
					User user = userMapper.selectByPrimaryKey(vo.getUserId());
					user.setLastTime(now);
					userMapper.updateByPrimaryKeySelective(user);
					
					result.setMessage("提交成功");
					result.setSuccess(true);
					return result;
				}
			});
		}catch(Exception e)
		{
			logger.error("添加或更异常", e);
			ret.setMessage("更新失败");
		}
		return ret;
	}

	@Override
	public Result<UserTCMVo> getTCM(Long userId) {
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
				
				String resultMsg = "<p>您的中医体质得分：平和质"+vo.getPingheScore()+"分，气虚质"+vo.getQixuScore()+"分，阳虚质"+vo.getYangxuScore()+"分，阴虚质"+vo.getYinxuScore()+"分，痰湿质"+vo.getTanshiScore()+"分，湿热质"+vo.getShireScore()+"分，血瘀质"+vo.getXueyuScore()+"分，气郁质"+vo.getQiyuScore()+"分，特禀质"+vo.getTebingScore()+"分。</p>";
				String tcmResult = "<p>判定结果为：您的中医体质";
				if (vo.getPingheScore()>=60 && vo.getQixuScore() < 30 && vo.getQiyuScore() < 30 
						&& vo.getShireScore() < 30 && vo.getTanshiScore() < 30 && vo.getTebingScore() < 30 
							&& vo.getYangxuScore() < 30 && vo.getYinxuScore() < 30 && vo.getXueyuScore() < 30)
				{
					tcmResult += "是平和质,";
				}else if (vo.getPingheScore()>=60 && vo.getQixuScore() < 40 && vo.getQiyuScore() < 40 
						&& vo.getShireScore() < 40 && vo.getTanshiScore() < 40 && vo.getTebingScore() < 40 
						&& vo.getYangxuScore() < 40 && vo.getYinxuScore() < 40 && vo.getXueyuScore() < 40){
					tcmResult += "基本是平和质,";
				}
				
				if (vo.getQixuScore()>=40){
					tcmResult += "是气虚质,";
				}else if(vo.getQixuScore()>=30 && vo.getQixuScore()<40){
					tcmResult += "倾向是气虚质,";
				}
				 
				if (vo.getYangxuScore()>=40){
					tcmResult += "是阳虚质,";
				}else if(vo.getYangxuScore()>=30 && vo.getYangxuScore()<40){
					tcmResult += "倾向是阳虚质,";
				}
				
				if (vo.getYinxuScore()>=40){
					tcmResult += "是阴虚质,";
				}else if(vo.getYinxuScore()>=30 && vo.getYinxuScore()<40){
					tcmResult += "倾向是阴虚质,";
				}
				
				if (vo.getTanshiScore()>=40){
					tcmResult += "是痰湿质,";
				}else if(vo.getTanshiScore()>=30 && vo.getTanshiScore()<40){
					tcmResult += "倾向是痰湿质,";
				}
				
				if (vo.getShireScore()>=40){
					tcmResult += "是湿热质,";
				}else if(vo.getShireScore()>=30 && vo.getShireScore()<40){
					tcmResult += "倾向是湿热质,";
				}
				
				if (vo.getXueyuScore()>=40){
					tcmResult += "是血瘀质,";
				}else if(vo.getXueyuScore()>=30 && vo.getXueyuScore()<40){
					tcmResult += "倾向是血瘀质,";
				}
				
				if (vo.getQiyuScore()>=40){
					tcmResult += "是气郁质,";
				}else if(vo.getQiyuScore()>=30 && vo.getQiyuScore()<40){
					tcmResult += "倾向是气郁质,";
				}

				if (vo.getTebingScore()>=40){
					tcmResult += "是特禀质,";
				}else if(vo.getTebingScore()>=30 && vo.getTebingScore()<40){
					tcmResult += "倾向是特禀质,";
				}
				if (tcmResult.endsWith(","))
					tcmResult = tcmResult.substring(0,tcmResult.length()-1);
				tcmResult += "</p>";
				
				tcmResult += "<p>解释说明：</p>";
				tcmResult += "<p>体质是可以调整的。体质既禀成于先天，亦关系于后天。体质的稳定性由相似的遗传背景形成，年龄、性别等因素也可使体质表现出一定的稳定性。然而，体质的稳定性是相对的，个体在生长壮老的生命过程中，由于因受环境、精神、营养、锻炼、疾病等内外环境中诸多因素的影响，会使体质发生变化。体质只具有相对的稳定性，同时具有动态可变性。这种特征是体质可调的基础。</p>";
				tcmResult += "<p>药物及有关治疗方法可纠正机体阴阳、气血、津液失衡，是体质可调的实践基础。比如我们创制的化痰祛湿方能减少体内脂肪积聚，改变脂质代谢，降低血液黏稠度，改善痰湿体质，使病理性脂肪肝得到逆转，并能防止肝纤维性变。</p>";
				tcmResult += "<p>重视不同体质对疾病与证候的内在联系及对方药等治疗应答反应的差异是实施个体化诊疗、贯彻“因人制宜”思想的具体实践，根据不同体质类型或状态，或益气，或补阴，或温阳，或利湿，或开郁，或疏血，以调整机体的阴阳动静、失衡倾向，体现“以人为本”、“治病求本”的治疗原则；及早发现、干预体质的偏颇状态，进行病因预防、临床前期预防、临床预防，实现调质拒邪、调质防病及调质防变，以实践中医“治未病”。如阳虚体质怕冷的人，在饮食上，可多食牛肉、羊肉、韭菜、生姜等温阳之品，少食梨、西瓜、荸荠等生冷寒凉食物，少饮绿茶，还可食当归生姜羊肉汤等。</p>";
				tcmResult += "<p>想了解中医体质的更多信息，可详见以下链接：</p>";
				tcmResult += "<p><a href=\"https://mp.weixin.qq.com/s/il0c6SfKlB444o-Db2uQew\">中医体质类型特点</a></p>";
				tcmResult += "<p><a href=\"https://mp.weixin.qq.com/s/il0c6SfKlB444o-Db2uQew\">中医体质管理方案</a></p>";
				
				vo.setResultTitle("中医体质测评结果");
				vo.setResultMsg(resultMsg + tcmResult);
				
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("获取中医体制异常", e);
			ret.setMessage("获取中医体制异常");
		}
		return ret;
	}
	private int null2zero(Integer val)
	{
		if (val == null)
			return 0;
		else
			return val;
	}
}
