package com.breeze.health.service.impl;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserPsySuicideVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.entity.User;
import com.breeze.health.entity.UserLiving;
import com.breeze.health.entity.UserLivingExample;
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
import com.breeze.health.mapper.UserMapper;
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
	UserMapper userMapper;
	
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
				
				
				psychologicalReport += "";
				if (gad7!=null && phq9!=null)
				{
					if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示您目前的情绪状态良好，没有焦虑和抑郁情绪。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻微抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和轻度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";

						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和轻度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和中度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}
					
				}
				
				
				psychologicalReport += "<p>随着年龄的增长，人们的记忆力会逐渐下降，进而可能出现其他认知功能的下降。</p>";
				if (ad8!=null)
				{
					if (ad8.getAd8Score()>=2)
					{
						//认知功能受损
						psychologicalReport += "<p>经初步测试，结果提示您可能存在认知功能受损，应尽快到当地医院的认知门诊做进一步的检查，以明确诊断和及时治疗。</p>";
						psychologicalReport += "<p>认知功能是指人脑加工、储存和提取信息的能力，包括记忆力、注意力、定向力、计算力、理解力、判断力、语言能力等，是人对外界事物的全面感知的能力。认知功能障碍泛指各种原因导致的不同程度的认知功能损害，包括轻度认知功能障碍和痴呆。</p>";
						psychologicalReport += "<p>老年人随着年龄的增长，大脑也逐渐在老化，加之各种慢性病，尤其是心脑血管疾病的影响，发生认知功能损害的风险增加。专家建议，中年人和老年人都需要有意识地进行大脑的认知功能训练。</p>";
						psychologicalReport += "<p>您可以参考以下信息进行相关的认知功能训练。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/yOtpbvqq0VfAq8KDOlVuxQ\">认知功能训练</a></p>";
					}else
					{
						psychologicalReport += "<p>您认知功能正常。</p>";
						psychologicalReport += "<p>老年人随着年龄的增长，大脑也逐渐在老化，加之各种慢性病，尤其是心脑血管疾病的影响，发生认知功能损害的风险增加。专家建议，中年人和老年人都需要有意识地进行大脑的认知功能训练。</p>";
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
			
			User user = userMapper.selectByPrimaryKey(vo.getUserId());
			user.setLastTime(now);
			userMapper.updateByPrimaryKeySelective(user);
			
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
				
				int scoreF1 = null2ZeroReverse(vo.getQ1()) + null2ZeroReverse(vo.getQ7()) + null2ZeroReverse(vo.getQ12()) + null2zero(vo.getQ17()) + null2zero(vo.getQ19()) + null2ZeroReverse(vo.getQ22()) + null2zero(vo.getQ23()) +  null2zero(vo.getQ26()) + null2zero(vo.getQ29());
				int scoreF2 = null2zero(vo.getQ2())+ null2ZeroReverse(vo.getQ3()) + null2ZeroReverse(vo.getQ8()) + null2zero(vo.getQ9()) + null2zero(vo.getQ13())+ null2ZeroReverse(vo.getQ14())+ null2ZeroReverse(vo.getQ18())+ null2ZeroReverse(vo.getQ20())+ null2zero(vo.getQ24())+ null2zero(vo.getQ25());
				int scoreF3 = null2zero(vo.getQ4()) + null2zero(vo.getQ6()) + null2ZeroReverse(vo.getQ10()) + null2ZeroReverse(vo.getQ15())+ null2ZeroReverse(vo.getQ28());
				int scoreF4 = null2zero(vo.getQ5()) + null2ZeroReverse(vo.getQ11()) + null2zero(vo.getQ16()) + null2zero(vo.getQ21()) + null2zero(vo.getQ27());
				
				Float f1 = scoreF1/9f;
				Float f2 = scoreF2/10f;
				Float f3 = scoreF3/5f;
				Float f4 = scoreF4/5f;
				
				String f1t = "";
				String f2t = "";
				String f3t = "";
				String f4t = "";
				if (f1<=2.5)
					f1t = "肯定、认可、理解和宽容";
				else if(f1>2.5 && f1<3.5)
					f1t = "矛盾或中立";
				else
					f1t = "反对、否定、排斥和歧视";
				
				if (f2<=2.5)
					f2t = "肯定、认可、理解和宽容";
				else if(f2>2.5 && f2<3.5)
					f2t = "矛盾或中立";
				else
					f2t = "反对、否定、排斥和歧视";
				
				if (f3<=2.5)
					f3t = "肯定、认可、理解和宽容";
				else if(f3>2.5 && f3<3.5)
					f3t = "矛盾或中立";
				else
					f3t = "反对、否定、排斥和歧视";
				
				if (f4<=2.5)
					f4t = "肯定、认可、理解和宽容";
				else if(f4>2.5 && f4<3.5)
					f4t = "矛盾或中立";
				else
					f4t = "反对、否定、排斥和歧视";
				
				DecimalFormat decimalFormat=new DecimalFormat(".00");
				String report = "";
				report += "<p>关于对自杀行为性质的认识: "+scoreF1+"(均分："+decimalFormat.format(f1)+" ) ，您对自杀行为持"+f1t+"的态度；</p>";
				report += "<p>关于对自杀者的态度: "+scoreF2+"(均分："+decimalFormat.format(f2)+" )，您对自杀者持"+f2t+"的态度；</p>";
				report += "<p>关于对自杀者家属的态度: "+scoreF3+"(均分："+decimalFormat.format(f3)+" )，您对自杀者家属持"+f3t+"的态度；</p>";
				report += "<p>关于对安乐死的态度: "+scoreF1+"(均分： "+decimalFormat.format(f4)+")，您对安乐死持"+f4t+"的态度。</p>";

				report += "<p>自杀是人类社会普遍存在的一种行为。在人类历史进程中，人们受社会发展水平、宗教思想、文化背景等的影响，对自杀的态度也有所不同，但一般来说，自杀行为被认为有悖于社会基本的伦理道德，对社会现实产生极其消极的负面影响。从个人来讲，每个人的生命都是极其珍贵的，我们应该对人生抱有积极乐观的态度，在克服一个个的困难、挫折和挑战中不断成长。自杀行为不仅威胁到实施者本人的生命安全，还会给周围的亲人朋友造成心理上的伤害。 </p>";
				report += "<p>导致产生自杀意念的原因很多，其中抑郁症是当今社会自杀的最主要原因之一。 </p>";
				report += "<p>“不向外界求助，独自在死胡同里打转”是抑郁症发病及病情加重的重要因素之一。70%的抑郁症患者曾有过自杀的念头，有15% 死于自杀。当我们听到某位明星因抑郁症而自杀时，常常会很疑惑，他患有抑郁症多年，为什么没有被发现呢？这是因为有些抑郁症属于隐形抑郁，其中有一种被称为“微笑型抑郁”，多发于身份高、学识高、事业有成的人群。患者的内心感到极度压抑，表面却若无其事，面带微笑。这类患者在人群中看起来和平时一样，可能会出现效率下降、精力差等情况。但他独处时，就会特别沉默。这是因为心理疾病本身有一定的主观性和隐秘性。抑郁症的核心是主观痛苦，如果没有严重到破坏社会功能，别人就很难察觉出来。一个人独处时才是抑郁暴露得最充分的时候。当他离开人群，从人群中回归到一个人孤独的状态时，突然觉得太痛苦了，活得太累，可能就会选择走极端。 </p>";
				report += "<p>预防自杀坚持“七要七不要”：要重视不要忽视；要讨论不要躲避；要理解不要说教；要帮助不要刺激；要陪伴不要独处；要保护不要隐瞒；要治疗不要等待。当感到自己压力过大或无原因长时间心情不愉快，莫名烦躁时，应向身边的亲人、朋友求助。可通过暂时放下工作、听听音乐、与家人聚会或则出去旅游等不同方式缓解压力。 </p>";
				report += "<p>当一个人出现自杀意念时，可尝试以下缓解方法： </p>";
				report += "<p>1. 勇于讨论自杀话题。谈论就是一种支持，躲避反而让人绝望。 </p>";
				report += "<p>2. 寻求共情与理解。  </p>";
				report += "<p>3. 有人陪伴，陪伴本身就是一种良好的支持。 </p>";
				report += "<p>4. 利用社会支持系统，主动寻求帮助。  </p>";
				report += "<p>5.及时治疗干预，时间不是缓解自杀意念的良药，等待只能延误时机。 </p>";
				report += "<p>如果通过这些方法依旧没有得到有效的改善，那么就要去寻求专业人员的帮助。如果只是心理方面的因素，比如：家庭纠纷、工作压力、不良事件的影响，完全是可以通过心理治疗进行干预的。经过一段时间的干预治疗后，基本可以让人能认识自我、提高与人沟通能力、促进心理成长，提升自尊感等。而如果是患有精神障碍方面的问题，可通过药物治疗辅助心理治疗的方式消除疾病。早发现早治疗，治愈率是特别高的。 </p>";
				
				vo.setResultTitle("自杀态度测评结果");
				vo.setResultMsg(report);
				
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("获取心理测试异常", e);
			ret.setMessage("获取心理测试失败");
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
	private int null2ZeroReverse(Integer val) {
		if (val == null)
			return 0;
		else
			return 6-val;
	}
	
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

	@Override
	public Result<List<UserPsychologicalVo>> getPsyDate(Long userId) {
		Result<List<UserPsychologicalVo>> ret = new Result<List<UserPsychologicalVo>>();
		try{
			UserPsychologicalExample example = new UserPsychologicalExample();
			example.createCriteria().andUserIdEqualTo(userId);
			example.setOrderByClause(" id desc");
			List<UserPsychological> psys = userPsychologicalMapper.selectByExample(example);
			if (psys!= null && psys.size()>0)
			{
				List<UserPsychologicalVo> data = new ArrayList<UserPsychologicalVo>();
				for(UserPsychological psy:psys) {
					if (data.size()>0)
					{
						UserPsychologicalVo last = data.get(data.size()-1);
						Calendar ca1 = Calendar.getInstance();
						Calendar ca2 = Calendar.getInstance();
						ca1.setTime(last.getCreateTime());
						ca2.setTime(psy.getCreateTime());
					    if (ca1.get(Calendar.MONTH)!=ca2.get(Calendar.MONTH)) {
					    	UserPsychologicalVo vo = new UserPsychologicalVo();
					    	BeanUtils.copyProperties(psy, vo);
							vo.setDateStr(format.format(psy.getCreateTime()));
							vo.setCreateTime(psy.getCreateTime());
							data.add(vo);
					    }
					}else
					{
						UserPsychologicalVo vo = new UserPsychologicalVo();
						BeanUtils.copyProperties(psy, vo);
						vo.setDateStr(format.format(psy.getCreateTime()));
						vo.setCreateTime(psy.getCreateTime());
						data.add(vo);
					}
				}
				ret.setData(data);
			}
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("获取生活习惯异常", e);
			ret.setMessage("获取生活习惯异常");
		}
		return ret;
	}

	@Override
	public Result<UserPsychologicalVo> getPsyById(Long id) {
		Result<UserPsychologicalVo> ret = new Result<UserPsychologicalVo>();
		try{
			UserPsychological psy = userPsychologicalMapper.selectByPrimaryKey(id);
			if (psy!= null)
			{
				
				UserPsychologicalAD8 ad8 = null;
				UserPsychologicalGAD7 gad7 = null;
				UserPsychologicalPHQ9 phq9 = null;
				
				UserPsychologicalVo vo = new UserPsychologicalVo();

				UserPsychologicalAD8Example ad8Example = new UserPsychologicalAD8Example();
				ad8Example.createCriteria().andPsyIdEqualTo(psy.getId());
				List<UserPsychologicalAD8> ad8s = userPsychologicalAD8Mapper.selectByExample(ad8Example);
				if (ad8s!= null && ad8s.size()>0)
				{
					ad8 = ad8s.get(0);
					BeanUtils.copyProperties(ad8, vo);
				}
				
				UserPsychologicalGAD7Example gad7Example = new UserPsychologicalGAD7Example();
				gad7Example.createCriteria().andPsyIdEqualTo(psy.getId());
				List<UserPsychologicalGAD7> gad7s = userPsychologicalGAD7Mapper.selectByExample(gad7Example);
				if (gad7s!= null && gad7s.size()>0)
				{
					gad7 = gad7s.get(0) ;
					BeanUtils.copyProperties(gad7, vo);
				}
				
				UserPsychologicalPHQ9Example phq9Example = new UserPsychologicalPHQ9Example();
				phq9Example.createCriteria().andPsyIdEqualTo(psy.getId());
				List<UserPsychologicalPHQ9> phq9s = userPsychologicalPHQ9Mapper.selectByExample(phq9Example);
				if (phq9s!= null && phq9s.size()>0)
				{
					phq9 = phq9s.get(0);
					BeanUtils.copyProperties(phq9, vo);
				}
				
				BeanUtils.copyProperties(psy, vo);
				
				String psychologicalReport = "";
				
				
				psychologicalReport += "";
				if (gad7!=null && phq9!=null)
				{
					if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示您目前的情绪状态良好，没有焦虑和抑郁情绪。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻微抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和轻度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑和抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=0 && gad7.getGad7Score()<=4 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度抑郁情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=5 && gad7.getGad7Score()<=9 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在轻度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响，不良的生活事件，个性特点等，通过分析引起焦虑的原因，进行有针对性的干预。平日您可以做一些放松训练来缓解焦虑情绪。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和中重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=10 && gad7.getGad7Score()<=13 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在中度焦虑和重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";

						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和轻度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和中度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=14 && gad7.getGad7Score()<=18 && phq9.getPhq9Score()>=20)
					{
						psychologicalReport += "<p>测试显示，您可能存在中重度焦虑和重度抑郁情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=0 && phq9.getPhq9Score()<=4)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=5 && phq9.getPhq9Score()<=9)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=10 && phq9.getPhq9Score()<=14)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。抑郁情绪并不稀奇，也不可怕，可称之为“心灵的感冒”，每个人一生中的不同时段，都可能出现抑郁情绪。轻中度抑郁情绪无需药物治疗，只要及时调整、疏导，改变刺激环境，大多可以缓解。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}else if (gad7.getGad7Score()>=19 && gad7.getGad7Score()<=21 && phq9.getPhq9Score()>=15 && phq9.getPhq9Score()<=19)
					{
						psychologicalReport += "<p>测试显示，您可能存在重度焦虑情绪。</p>";
						psychologicalReport += "<p>对于此，您不用过分紧张，即便是正常人群也可能存在焦虑情绪。焦虑是对亲人或自己生命安全、前途命运等的过度担心而产生的一种烦躁情绪。其中含有着急、挂念、忧愁、紧张、恐慌、不安等成分。它与危急情况和难以预测、难以应付的事件有关。事过境迁、焦虑就可能解除。有人并无客观原因而长期处于焦虑状态，常常无缘无故害怕大祸临头，担心患有不可救药的严重疾病，以致出现坐卧不宁、惶惶不安等症状。这种异常焦虑，才称之为焦虑症。首先您自省一下，是否有一些引发您产生焦虑情绪的原因，如慢性病的影响、不良的生活事件、个性特点等，针对引起焦虑的原因，可以进行针对性的干预。平日您可以做一些放松训练。</p>";
						psychologicalReport += "<p>抑郁是一种很常见的情绪反应，特别是现代社会，相对比精神心理，物质生活已经极大丰富，人们也更加关注自己的内心世界，可能内心的满足感与成就感就有所欠缺。当人们遇到工作压力、生活挫折、痛苦境遇、生老病死、天灾人祸等情况时，可能就会产生抑郁情绪。几乎每个人都可能会在某个时候觉得情绪低落。抑郁是指以心境低落为主的精神状态。常伴有各种症状，如焦虑、激越、无价值感、无助感、无望感、自杀观念、意志减退、精神运动迟滞，及各种躯体症状和生理机能障碍（如睡眠障碍）。请结合自身的情况，反思自身的抑郁情绪是否有一定的诱因，如果存在诱因，我们可以通过祛除诱因来达到缓解抑郁情绪的目的。如果诱因无法祛除或生活事件解决不了，尽可能寻求周围的社会支持系统获取帮助。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/ev0TRzsur1aVvFT7gpgFyw\">情绪管理的常用方法</a></p>";
						psychologicalReport += "<p>如果不能缓解，可求助专业的心理医生进行心理治疗，他们将根据您的具体情况给予更专业的指导和心理治疗。</p>";
					}
					
				}
				
				
				psychologicalReport += "<p>随着年龄的增长，人们的记忆力会逐渐下降，进而可能出现其他认知功能的下降。</p>";
				if (ad8!=null)
				{
					if (ad8.getAd8Score()>=2)
					{
						//认知功能受损
						psychologicalReport += "<p>经初步测试，结果提示您可能存在认知功能受损，应尽快到当地医院的认知门诊做进一步的检查，以明确诊断和及时治疗。</p>";
						psychologicalReport += "<p>认知功能是指人脑加工、储存和提取信息的能力，包括记忆力、注意力、定向力、计算力、理解力、判断力、语言能力等，是人对外界事物的全面感知的能力。认知功能障碍泛指各种原因导致的不同程度的认知功能损害，包括轻度认知功能障碍和痴呆。</p>";
						psychologicalReport += "<p>老年人随着年龄的增长，大脑也逐渐在老化，加之各种慢性病，尤其是心脑血管疾病的影响，发生认知功能损害的风险增加。专家建议，中年人和老年人都需要有意识地进行大脑的认知功能训练。</p>";
						psychologicalReport += "<p>您可以参考以下信息进行相关的认知功能训练。</p>";
						psychologicalReport += "<p><a href=\"https://mp.weixin.qq.com/s/yOtpbvqq0VfAq8KDOlVuxQ\">认知功能训练</a></p>";
					}else
					{
						psychologicalReport += "<p>您认知功能正常。</p>";
						psychologicalReport += "<p>老年人随着年龄的增长，大脑也逐渐在老化，加之各种慢性病，尤其是心脑血管疾病的影响，发生认知功能损害的风险增加。专家建议，中年人和老年人都需要有意识地进行大脑的认知功能训练。</p>";
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
}
