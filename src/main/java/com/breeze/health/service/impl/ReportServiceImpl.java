package com.breeze.health.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserReportVo;
import com.breeze.health.entity.UserHealthReport;
import com.breeze.health.entity.UserHealthReportExample;
import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingHabitExample;
import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMealExample;
import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserLivingMovementExample;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import com.breeze.health.entity.UserPsychologicalAD8;
import com.breeze.health.entity.UserPsychologicalAD8Example;
import com.breeze.health.entity.UserPsychologicalGAD7;
import com.breeze.health.entity.UserPsychologicalGAD7Example;
import com.breeze.health.entity.UserPsychologicalPHQ9;
import com.breeze.health.entity.UserPsychologicalPHQ9Example;
import com.breeze.health.entity.UserSick;
import com.breeze.health.entity.UserSickExample;
import com.breeze.health.mapper.UserHealthReportMapper;
import com.breeze.health.mapper.UserLivingHabitMapper;
import com.breeze.health.mapper.UserLivingMealMapper;
import com.breeze.health.mapper.UserLivingMovementMapper;
import com.breeze.health.mapper.UserPhysiologicalMapper;
import com.breeze.health.mapper.UserPsychologicalAD8Mapper;
import com.breeze.health.mapper.UserPsychologicalGAD7Mapper;
import com.breeze.health.mapper.UserPsychologicalPHQ9Mapper;
import com.breeze.health.mapper.UserSickMapper;
import com.breeze.health.service.ReportService;
import com.breeze.health.util.BeanUtils;
import com.github.pagehelper.PageHelper;

@Service("reportService")
public class ReportServiceImpl implements ReportService{
	private static Logger logger = LoggerFactory.getLogger(ReportServiceImpl.class);
	@Autowired
	UserHealthReportMapper userHealthReportMapper;

	@Autowired
	UserPhysiologicalMapper userPhysiologicalMapper;
	
	@Autowired
	UserPsychologicalAD8Mapper userPsychologicalAD8Mapper;
	
	@Autowired
	UserPsychologicalGAD7Mapper userPsychologicalGAD7Mapper;
	
	@Autowired
	UserPsychologicalPHQ9Mapper userPsychologicalPHQ9Mapper;
	
	@Autowired
	UserLivingHabitMapper userLivingHabitMapper;
	
	@Autowired
	UserLivingMovementMapper userLivingMovementMapper;
	
	@Autowired
	UserLivingMealMapper userLivingMealMapper;
	
	@Autowired
	UserSickMapper userSickMapper;
	
	@Override
	public Result<UserReportVo> getReprot(Long userId) {
		Result<UserReportVo> ret = new Result<UserReportVo>();
		try{
			UserPhysiological phy = null;
			UserPhysiologicalExample phyExample = new UserPhysiologicalExample();
			phyExample.createCriteria().andUserIdEqualTo(userId);
			phyExample.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List phys = userPhysiologicalMapper.selectByExample(phyExample);
			if (phys!=null && phys.size()>0)
			{
				phy = (UserPhysiological)phys.get(0);
			}else
			{
				ret.setMessage("请先完成生理指标测试");
				return ret;
			}
			
			UserSick sick = null;
			UserSickExample sickExample = new UserSickExample();
			sickExample.createCriteria().andUserIdEqualTo(userId);
			sickExample.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List sicks = userSickMapper.selectByExample(sickExample);
			if (sicks!=null && sicks.size()>0)
			{
				sick = (UserSick)sicks.get(0);
			}else
			{
				ret.setMessage("请先完成健康状况测试");
				return ret;
			}
			
			UserPsychologicalAD8 ad8 = null;
			UserPsychologicalAD8Example ad8Example = new UserPsychologicalAD8Example();
			ad8Example.createCriteria().andUserIdEqualTo(userId);
			ad8Example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List ad8s = userPsychologicalAD8Mapper.selectByExample(ad8Example);
			if (ad8s!=null && ad8s.size()>0)
			{
				ad8 = (UserPsychologicalAD8)ad8s.get(0);
			}else
			{
				ret.setMessage("请先完成情绪认知测试");
				return ret;
			}
			
			UserPsychologicalGAD7 gad7 = null;
			UserPsychologicalGAD7Example gad7Example = new UserPsychologicalGAD7Example();
			gad7Example.createCriteria().andUserIdEqualTo(userId);
			gad7Example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List gad7s = userPsychologicalGAD7Mapper.selectByExample(gad7Example);
			if (gad7s!=null && gad7s.size()>0)
			{
				gad7 = (UserPsychologicalGAD7)gad7s.get(0);
			}else
			{
				ret.setMessage("请先完成情绪认知测试");
				return ret;
			}
			
			UserPsychologicalPHQ9 phq9 = null;
			UserPsychologicalPHQ9Example phq9Example = new UserPsychologicalPHQ9Example();
			phq9Example.createCriteria().andUserIdEqualTo(userId);
			phq9Example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List phq9s = userPsychologicalPHQ9Mapper.selectByExample(phq9Example);
			if (phq9s!=null && phq9s.size()>0)
			{
				phq9 = (UserPsychologicalPHQ9)phq9s.get(0);
			}else
			{
				ret.setMessage("请先完成情绪认知测试");
				return ret;
			}
			
			UserLivingMeal meal = null;
			UserLivingMealExample mealExample = new UserLivingMealExample();
			mealExample.createCriteria().andUserIdEqualTo(userId);
			mealExample.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List meals = userLivingMealMapper.selectByExample(mealExample);
			if (meals!=null && meals.size()>0)
			{
				meal = (UserLivingMeal)meals.get(0);
			}else
			{
				ret.setMessage("请先完成生活习惯测试");
				return ret;
			}
			
			UserLivingMovement movement = null;
			UserLivingMovementExample movementExample = new UserLivingMovementExample();
			movementExample.createCriteria().andUserIdEqualTo(userId);
			movementExample.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List movements = userLivingMovementMapper.selectByExample(movementExample);
			if (movements!=null && movements.size()>0)
			{
				movement = (UserLivingMovement)movements.get(0);
			}else
			{
				ret.setMessage("请先完成生活习惯测试");
				return ret;
			}
			
			UserLivingHabit habit = null;
			UserLivingHabitExample habitExample = new UserLivingHabitExample();
			habitExample.createCriteria().andUserIdEqualTo(userId);
			habitExample.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List habits = userLivingHabitMapper.selectByExample(habitExample);
			if (habits!=null && habits.size()>0)
			{
				habit = (UserLivingHabit)habits.get(0);
			}else
			{
				ret.setMessage("请先完成生活习惯测试");
				return ret;
			}
			UserHealthReportExample reportExample = new UserHealthReportExample();
			reportExample.createCriteria().andSickIdEqualTo(sick.getId()).andPhyIdEqualTo(phy.getId())
										.andGad7IdEqualTo(gad7.getId()).andPhq9IdEqualTo(phq9.getId())
										.andAd8IdEqualTo(ad8.getId()).andMealIdEqualTo(meal.getId())
										.andMovementIdEqualTo(movement.getId()).andHabitIdEqualTo(habit.getId());
			List<UserHealthReport> reports = userHealthReportMapper.selectByExample(reportExample);
			
			if (reports!=null && reports.size()>0)
			{
				UserReportVo vo = new UserReportVo();
				BeanUtils.copyProperties(reports.get(0), vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				String sickReport = "";
				int sickTop5Count = 0;
				String sickName = "";
				//高血压
				if (sick.getHighBloodPressure() == 2)
				{
					sickName += "".equals(sickName)?"高血压":",高血压";
					sickTop5Count += 1;
				}
				//冠心病
				if (sick.getCoronaryHeartDisease()== 2)
				{
					sickName += "".equals(sickName)?"冠心病":",冠心病";
					sickTop5Count += 1;
				}
				//高脂血症
				if (sick.getHyperlipidemia()== 2)
				{
					sickName += "".equals(sickName)?"高脂血症":",高脂血症";
					sickTop5Count += 1;
				}
				//糖尿病
				if (sick.getDiabetes()== 2)
				{
					sickName += "".equals(sickName)?"糖尿病":",糖尿病";
					sickTop5Count += 1;
				}
				//脑血管疾病
				if (sick.getCerebrovascularDisease()== 2)
				{
					sickName += "".equals(sickName)?"脑血管疾病":",脑血管疾病";
					sickTop5Count += 1;
				}
				
				if (sickTop5Count>1)
				{
					sickReport += "您同时患有"+sickName+"等，这些疾病与饮食、运动等日常习惯存在密切关系，彼此互相影响，您若在疾病控制与康复过程中遇到疑惑、困难等，欢迎您及时与签约医生和社区护士沟通联系，他们将会耐心解答您的问题，并与您共同制定可行的治疗和护理措施，提高您的健康水平，降低各种并发症的发生风险。";
				}else if(sickTop5Count==1)
				{
					sickReport += "您有"+sickName+"，应注意调整饮食与运动习惯，定期复查，并根据医生建议服用相关药物，以降低心脑血管疾病的发生风险。";
				}
				
				
				//慢性胃炎
				if (sick.getChronicGastritis()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有慢性胃炎，平时应注意饮食规律，少食多餐、细嚼慢咽。";
				}
				
				//胃溃疡
				if (sick.getStomachUlcer()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有胃溃疡，平时应注意饮食规律，少食多餐、细嚼慢咽。";
				}
				
				//支气管哮喘
				if (sick.getBronchialAsthma()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您长期患有支气管哮喘，注意寻找可能的过敏源，并避免与过敏源的接触。";
				}
				
				//copd
				if (sick.getCopd()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有COPD，应注意天气变化，及时调整衣物，避免着凉感冒；适当进行体育锻炼，营养均衡，适当补充维生素C等；平时可规律进行呼吸操练习；请您务必戒烟（对于吸烟者）；出现喘息等不适症状及时就诊。长期家庭氧疗者，可关注公众号（长期家庭氧疗）的相关信息。";
				}
				
				//骨质疏松症
				if (sick.getOsteoporosis()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您有骨质疏松症，除了遵医嘱用药外，还要注意适当运动、多晒太阳，但在活动过程中应注意安全，避免跌倒等情况的发生。您可关注骨质疏松症的日常护理。";
				}
				
				float bmi = phy.getWeight()/((phy.getHeight()/100f)*(phy.getHeight()/100f));
				if (bmi>=28)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您的体重属于肥胖，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。";
					sickReport += "\n能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。";
				}else if(bmi>=24)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您的体重属于超重，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。";
					sickReport += "\n能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。";
				}
				
				String mealReport = "";
				if (meal.getMeal()!=null && meal.getMeal()==2)
				{
					mealReport = "您的饮食习惯有待调整，相关知识请参见饮食指导。";
				}
				
				String movementReport = "";
				
				float violent = ((movement.getViolentMinutePerDay()==null?0:movement.getViolentMinutePerDay())*(movement.getViolentDaysPerWeek()==null?0:movement.getViolentDaysPerWeek()))/60f;
				float moderate = ((movement.getModerateMinutePerDay()==null?0:movement.getModerateMinutePerDay())*(movement.getModerateDaysPerWeek()==null?0:movement.getModerateDaysPerWeek()))/60f;
				float walk =  ((movement.getWalkMinutePerDay()==null?0:movement.getWalkMinutePerDay())*(movement.getWalkDaysPerWeek()==null?0:movement.getWalkDaysPerWeek()))/60f;
				
				moderate += 2*violent + walk/2;
				
				if (moderate<2)
				{
					movementReport = "您的运动量不足，运动形式和时间需要进行适当的调整 [运动指导]。";
				}
				
				String smokingReport = "";
				if (habit.getSmoking()!=null &&  (habit.getSmoking()==2 || habit.getSmoking()==3))
				{
					smokingReport = "吸烟有害健康！您有吸烟的习惯，建议您向签约医生或社区护士咨询戒烟的指导，他们将会为您提供个性化的戒烟帮助。";
				}else if(habit.getSmoking()!=null && habit.getSmoking()==4)
				{
					smokingReport = "您已成功戒烟，是其他人的榜样，欢迎您在论坛中分享您成功戒烟的经验和感受，以帮助更多的吸烟者戒烟。";
				}
				
				
				String psychologicalReport = "";
				
				psychologicalReport = "随着年龄的增长，人们的记忆力会逐渐下降，进而可能出现其他认知功能的下降。测试显示您存在记忆力下降的情况，建议您进行认知功能的相关测试，同时有意进行相关的认知功能锻炼，可延缓认知功能下降的进程。";
				if (ad8.getScore()>=2)
				{
					//认知功能受损
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在认知功能受损，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}
				
				if (gad7.getScore()>=5 && gad7.getScore()<=9)
				{
					//可能有轻微焦虑症
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在轻微焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if (gad7.getScore()>=10 && gad7.getScore()<=13)
				{
					//可能有中度焦虑症
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if (gad7.getScore()>=14 && gad7.getScore()<=18)
				{
					//可能有中重度焦虑症
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中重度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if (gad7.getScore()>=19)
				{
					//可能有重度焦虑症
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在重度焦虑症，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}
				
				if (phq9.getScore()>=5 && phq9.getScore()<=9)
				{
					//轻度抑郁
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在轻度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if (phq9.getScore()>=10 && phq9.getScore()<=14)
				{
					//中度抑郁
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if (phq9.getScore()>=15 && phq9.getScore()<=19)
				{
					//中重度抑郁
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在中重度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}else if(phq9.getScore()>=20){
					//重度抑郁
					psychologicalReport = "\n很多人都会有过焦虑或抑郁的情绪状态，若这种状态持续存在同样会影响我们的身体健康，降低我们的生活质量，经初步测试，结果提示您可能存在重度抑郁，您可以通过相关链接了解更多的相关信息，并进行适当的自我调节，若有疑问或需要更进一步的帮助，请与您的签约医生或社区护士联系。";
				}
				Date now = new Date();
				UserHealthReport report = new UserHealthReport();
				report.setAd8Id(ad8.getId());
				report.setPhq9Id(phq9.getId());
				report.setGad7Id(gad7.getId());
				report.setMealId(meal.getId());
				report.setMovementId(movement.getId());
				report.setHabitId(habit.getId());
				report.setSickId(sick.getId());
				report.setPhyId(phy.getId());
				report.setUserId(userId);
				report.setSickReport(sickReport);
				report.setMealReport(mealReport);
				report.setMovementReport(movementReport);
				report.setSmokingReport(smokingReport);
				report.setPsychologicalReport(psychologicalReport);
				report.setCreateTime(now);
				report.setUpdateTime(now);
				
				userHealthReportMapper.insert(report);
				
				UserReportVo vo = new UserReportVo();
				BeanUtils.copyProperties(report, vo);
				ret.setSuccess(true);
				ret.setData(vo);
			}
			
		}catch(Exception e)
		{
			logger.error("获取报告异常", e);
			ret.setMessage("获取报告失败");
		}
		return ret;
	}
	

}
