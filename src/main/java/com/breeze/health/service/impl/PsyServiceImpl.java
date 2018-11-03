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
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.beans.vo.UserPsySuicideVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import com.breeze.health.entity.UserPsychological;
import com.breeze.health.entity.UserPsychologicalAD8;
import com.breeze.health.entity.UserPsychologicalAD8Example;
import com.breeze.health.entity.UserPsychologicalExample;
import com.breeze.health.entity.UserPsychologicalGAD7;
import com.breeze.health.entity.UserPsychologicalGAD7Example;
import com.breeze.health.entity.UserPsychologicalPHQ9;
import com.breeze.health.entity.UserPsychologicalPHQ9Example;
import com.breeze.health.entity.UserPsychologicalSuicide;
import com.breeze.health.entity.UserPsychologicalSuicideExample;
import com.breeze.health.mapper.UserPsychologicalAD8Mapper;
import com.breeze.health.mapper.UserPsychologicalGAD7Mapper;
import com.breeze.health.mapper.UserPsychologicalMapper;
import com.breeze.health.mapper.UserPsychologicalPHQ9Mapper;
import com.breeze.health.mapper.UserPsychologicalSuicideMapper;
import com.breeze.health.service.PsyService;
import com.breeze.health.util.BeanUtils;
import com.github.pagehelper.PageHelper;

@Service("psyService")
public class PsyServiceImpl implements PsyService{
	private static Logger logger = LoggerFactory.getLogger(PsyServiceImpl.class);
	
	@Autowired
	UserPsychologicalMapper userPsychologicalMapper;
	
	@Autowired
	UserPsychologicalAD8Mapper userPsychologicalAD8Mapper;
	
	@Autowired
	UserPsychologicalPHQ9Mapper userPsychologicalPHQ9Mapper;
	
	@Autowired
	UserPsychologicalGAD7Mapper userPsychologicalGAD7Mapper;
	
	@Autowired
	UserPsychologicalSuicideMapper userPsychologicalSuicideMapper;
	
	@Autowired
	TransactionTemplate transactionTemplate;
	
	
	
	@Override
	public Result<Void> addOrUpdatePsy(UserPsychologicalVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			final Date now = new Date();
			
			final UserPsychological psy = new UserPsychological();
			BeanUtils.copyProperties(vo, psy);
			
			
			final UserPsychologicalAD8 ad8 = new UserPsychologicalAD8();
			BeanUtils.copyProperties(vo, ad8);
			int ad8Score = 0;
			if(ad8.getAd8Q1()!=null && ad8.getAd8Q1()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q2()!=null && ad8.getAd8Q2()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q3()!=null && ad8.getAd8Q3()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q4()!=null && ad8.getAd8Q4()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q5()!=null && ad8.getAd8Q5()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q6()!=null && ad8.getAd8Q6()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q7()!=null && ad8.getAd8Q7()==2)
			{
				ad8Score += 1;
			}
			if(ad8.getAd8Q8()!=null && ad8.getAd8Q8()==2)
			{
				ad8Score += 1;
			}
			ad8.setAd8Score(ad8Score);
			
			
			final UserPsychologicalGAD7 gad7 = new UserPsychologicalGAD7();
			BeanUtils.copyProperties(vo, gad7);
			int gad7Score = 0;
			if (gad7.getGad7Q1()!=null)
			{
				gad7Score += gad7.getGad7Q1();
			}
			if (gad7.getGad7Q2()!=null)
			{
				gad7Score += gad7.getGad7Q2();
			}
			if (gad7.getGad7Q3()!=null)
			{
				gad7Score += gad7.getGad7Q3();
			}
			if (gad7.getGad7Q4()!=null)
			{
				gad7Score += gad7.getGad7Q4();
			}
			if (gad7.getGad7Q5()!=null)
			{
				gad7Score += gad7.getGad7Q5();
			}
			if (gad7.getGad7Q6()!=null)
			{
				gad7Score += gad7.getGad7Q6();
			}
			if (gad7.getGad7Q7()!=null)
			{
				gad7Score += gad7.getGad7Q7();
			}
			gad7.setGad7Score(gad7Score);
			
			
			final UserPsychologicalPHQ9 phq9 = new UserPsychologicalPHQ9();
			BeanUtils.copyProperties(vo, phq9);
			int phq9Score = 0;
			if (phq9.getPhq9Q1()!=null)
			{
				phq9Score += phq9.getPhq9Q1();
			}
			if (phq9.getPhq9Q2()!=null)
			{
				phq9Score += phq9.getPhq9Q2();
			}
			if (phq9.getPhq9Q3()!=null)
			{
				phq9Score += phq9.getPhq9Q3();
			}
			if (phq9.getPhq9Q4()!=null)
			{
				phq9Score += phq9.getPhq9Q4();
			}
			if (phq9.getPhq9Q5()!=null)
			{
				phq9Score += phq9.getPhq9Q5();
			}
			if (phq9.getPhq9Q6()!=null)
			{
				phq9Score += phq9.getPhq9Q6();
			}
			if (phq9.getPhq9Q7()!=null)
			{
				phq9Score += phq9.getPhq9Q7();
			}
			if (phq9.getPhq9Q8()!=null)
			{
				phq9Score += phq9.getPhq9Q8();
			}
			if (phq9.getPhq9Q9()!=null)
			{
				phq9Score += phq9.getPhq9Q9();
			}
			phq9.setPhq9Score(phq9Score);
			
			ret = transactionTemplate.execute(new TransactionCallback<Result<Void>>() {
				@Override
				public Result<Void> doInTransaction(TransactionStatus arg0) {
					Result<Void> result = new Result<Void>();
					if (psy.getId()!=null)
					{
						psy.setUpdateTime(now);
						userPsychologicalMapper.updateByPrimaryKeySelective(psy);
						UserPsychologicalAD8Example ad8Example = new UserPsychologicalAD8Example();
						ad8Example.createCriteria().andPsyIdEqualTo(psy.getId());
						List<UserPsychologicalAD8> ad8s = userPsychologicalAD8Mapper.selectByExample(ad8Example);
						if (ad8s.size()>0)
						{
							ad8.setId(ad8s.get(0).getId());
							ad8.setPsyId(psy.getId());
							ad8.setUpdateTime(now);
							userPsychologicalAD8Mapper.updateByPrimaryKeySelective(ad8);
						}else
						{
							ad8.setPsyId(psy.getId());
							ad8.setCreateTime(now);
							ad8.setUpdateTime(now);
							userPsychologicalAD8Mapper.insertSelective(ad8);
						}
						
						UserPsychologicalGAD7Example gad7Example = new UserPsychologicalGAD7Example();
						gad7Example.createCriteria().andPsyIdEqualTo(psy.getId());
						List<UserPsychologicalGAD7> gad7s = userPsychologicalGAD7Mapper.selectByExample(gad7Example);
						if (gad7s.size()>0)
						{
							gad7.setId(gad7s.get(0).getId());
							gad7.setPsyId(psy.getId());
							gad7.setUpdateTime(now);
							userPsychologicalGAD7Mapper.updateByPrimaryKeySelective(gad7);
						}else
						{
							gad7.setPsyId(psy.getId());
							gad7.setCreateTime(now);
							gad7.setUpdateTime(now);
							userPsychologicalGAD7Mapper.updateByPrimaryKeySelective(gad7);
						}

						UserPsychologicalPHQ9Example phq9Example = new UserPsychologicalPHQ9Example();
						phq9Example.createCriteria().andPsyIdEqualTo(psy.getId());
						List<UserPsychologicalPHQ9> phq9s = userPsychologicalPHQ9Mapper.selectByExample(phq9Example);
						if (phq9s.size()>0)
						{
							phq9.setId(phq9s.get(0).getId());
							phq9.setPsyId(psy.getId());
							phq9.setUpdateTime(now);
							userPsychologicalPHQ9Mapper.updateByPrimaryKeySelective(phq9);
						}else
						{
							phq9.setPsyId(psy.getId());
							phq9.setCreateTime(now);
							phq9.setUpdateTime(now);
							userPsychologicalPHQ9Mapper.updateByPrimaryKeySelective(phq9);
						}
						
					}else
					{
						psy.setCreateTime(now);
						psy.setUpdateTime(now);
						userPsychologicalMapper.insertSelective(psy);
						
						ad8.setPsyId(psy.getId());
						ad8.setCreateTime(now);
						ad8.setUpdateTime(now);
						userPsychologicalAD8Mapper.insert(ad8);
						
						gad7.setPsyId(psy.getId());
						gad7.setCreateTime(now);
						gad7.setUpdateTime(now);
						userPsychologicalGAD7Mapper.insert(gad7);
						
						phq9.setPsyId(psy.getId());
						phq9.setCreateTime(now);
						phq9.setUpdateTime(now);
						userPsychologicalPHQ9Mapper.insert(phq9);
					}
					result.setMessage("提交成功");
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
	public Result<UserPsychologicalVo> getPsy(Long userId) {
		Result<UserPsychologicalVo> ret = new Result<UserPsychologicalVo>();
		try{
			UserPsychologicalExample example = new UserPsychologicalExample();
			example.createCriteria().andUserIdEqualTo(userId);
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List psys = userPsychologicalMapper.selectByExample(example);
			if (psys!= null && psys.size()>0)
			{
				
				UserPsychologicalAD8 ad8 = null;
				UserPsychologicalGAD7 gad7 = null;
				UserPsychologicalPHQ9 phq9 = null;
				
				UserPsychologicalVo vo = new UserPsychologicalVo();

				UserPsychologicalAD8Example ad8Example = new UserPsychologicalAD8Example();
				ad8Example.createCriteria().andPsyIdEqualTo(((UserPsychological)psys.get(0)).getId());
				List<UserPsychologicalAD8> ad8s = userPsychologicalAD8Mapper.selectByExample(ad8Example);
				if (ad8s!= null && ad8s.size()>0)
				{
					ad8 = ad8s.get(0);
					BeanUtils.copyProperties(ad8, vo);
				}
				
				UserPsychologicalGAD7Example gad7Example = new UserPsychologicalGAD7Example();
				gad7Example.createCriteria().andPsyIdEqualTo(((UserPsychological)psys.get(0)).getId());
				List<UserPsychologicalGAD7> gad7s = userPsychologicalGAD7Mapper.selectByExample(gad7Example);
				if (gad7s!= null && gad7s.size()>0)
				{
					gad7 = gad7s.get(0) ;
					BeanUtils.copyProperties(gad7, vo);
				}
				
				UserPsychologicalPHQ9Example phq9Example = new UserPsychologicalPHQ9Example();
				phq9Example.createCriteria().andPsyIdEqualTo(((UserPsychological)psys.get(0)).getId());
				List<UserPsychologicalPHQ9> phq9s = userPsychologicalPHQ9Mapper.selectByExample(phq9Example);
				if (phq9s!= null && phq9s.size()>0)
				{
					phq9 = phq9s.get(0);
					BeanUtils.copyProperties(phq9, vo);
				}
				
				BeanUtils.copyProperties(psys.get(0), vo);
				
				String psychologicalReport = "";
				
				psychologicalReport = "随着年龄的增长，人们的记忆力会逐渐下降，进而可能出现其他认知功能的下降。测试显示您存在记忆力下降的情况，建议您进行认知功能的相关测试，同时有意进行相关的认知功能锻炼，可延缓认知功能下降的进程。";
				if (ad8!=null)
				{
					if (ad8.getAd8Score()>=2)
					{
						//认知功能受损
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在认知功能受损，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}
				}
				if (gad7!=null)
				{
					if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9)
					{
						//可能有轻微焦虑症
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在轻微焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13)
					{
						//可能有中度焦虑症
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18)
					{
						//可能有中重度焦虑症
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中重度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if (gad7.getGad7Score()>=19)
					{
						//可能有重度焦虑症
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在重度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}
				}
				if (phq9!=null)
				{
					if (phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						//轻度抑郁
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在轻度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if (phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						//中度抑郁
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if (phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						//中重度抑郁
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中重度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}else if(phq9.getPhq9Score()>=20){
						//重度抑郁
						psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在重度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
					}
				}
				vo.setResultTitle("情绪认知测评结果");
				vo.setResultMsg(psychologicalReport);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("未获取到心理测试");
			}
		}catch(Exception e)
		{
			logger.error("获取心理测试异常", e);
			ret.setMessage("获取心理测试异常");
		}
		return ret;
	}

	@Override
	public Result<Void> addOrUpdatePsySuicide(UserPsySuicideVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPsychologicalSuicide suicide = new UserPsychologicalSuicide();
			BeanUtils.copyProperties(vo, suicide);
			if (suicide.getId()!=null)
			{
				suicide.setUpdateTime(now);
				userPsychologicalSuicideMapper.updateByPrimaryKeySelective(suicide);
			}else
			{
				suicide.setCreateTime(now);
				suicide.setUpdateTime(now);
				userPsychologicalSuicideMapper.insert(suicide);
			}
			ret.setMessage("提交成功");
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更心理测试异常", e);
			ret.setMessage("更新心理测试失败");
		}
		return ret;
	}

	@Override
	public Result<UserPsySuicideVo> getPsySuicide(Long userId) {
		Result<UserPsySuicideVo> ret = new Result<UserPsySuicideVo>();
		try{
			UserPsychologicalSuicideExample example = new UserPsychologicalSuicideExample();
			example.createCriteria().andUserIdEqualTo(userId);
			PageHelper.startPage(1, 1);
			List suicides = userPsychologicalSuicideMapper.selectByExample(example);
			if (suicides!= null && suicides.size()>0)
			{
				UserPsySuicideVo vo = new UserPsySuicideVo();
				BeanUtils.copyProperties(suicides.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("未获取到心理测试");
			}
		}catch(Exception e)
		{
			logger.error("获取心理测试异常", e);
			ret.setMessage("获取心理测试失败");
		}
		return ret;
	}

}
