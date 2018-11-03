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
import com.github.pagehelper.PageHelper;

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
			ret.setMessage("提交成功");
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
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List sicks = userSickMapper.selectByExample(example);
			if (sicks!= null && sicks.size()>0)
			{
				UserSick sick = (UserSick)sicks.get(0);
				UserSickVo vo = new UserSickVo();
				BeanUtils.copyProperties(sick, vo);
				
				String sickReport = "";
				int sickTop5Count = 0;
				String sickName = "";
				//高血压
				if (sick.getHighBloodPressure()!=null && sick.getHighBloodPressure() == 2)
				{
					sickName += "".equals(sickName)?"高血压":",高血压";
					sickTop5Count += 1;
				}
				//冠心病
				if (sick.getCoronaryHeartDisease()!=null && sick.getCoronaryHeartDisease()== 2)
				{
					sickName += "".equals(sickName)?"冠心病":",冠心病";
					sickTop5Count += 1;
				}
				//高脂血症
				if (sick.getHyperlipidemia()!=null && sick.getHyperlipidemia()== 2)
				{
					sickName += "".equals(sickName)?"高脂血症":",高脂血症";
					sickTop5Count += 1;
				}
				//糖尿病
				if (sick.getDiabetes()!=null && sick.getDiabetes()== 2)
				{
					sickName += "".equals(sickName)?"糖尿病":",糖尿病";
					sickTop5Count += 1;
				}
				//脑血管疾病
				if (sick.getCerebrovascularDisease()!=null && sick.getCerebrovascularDisease()== 2)
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
				if (sick.getChronicGastritis() !=null && sick.getChronicGastritis()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有慢性胃炎，平时应注意饮食规律，少食多餐、细嚼慢咽。";
				}
				
				//胃溃疡
				if (sick.getStomachUlcer() !=null && sick.getStomachUlcer()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有胃溃疡，平时应注意饮食规律，少食多餐、细嚼慢咽。";
				}
				
				//支气管哮喘
				if (sick.getBronchialAsthma() !=null && sick.getBronchialAsthma()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您长期患有支气管哮喘，注意寻找可能的过敏源，并避免与过敏源的接触。";
				}
				
				//copd
				if (sick.getCopd() !=null && sick.getCopd()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您患有COPD，应注意天气变化，及时调整衣物，避免着凉感冒；适当进行体育锻炼，营养均衡，适当补充维生素C等；平时可规律进行呼吸操练习；请您务必戒烟（对于吸烟者）；出现喘息等不适症状及时就诊。长期家庭氧疗者，可关注公众号（长期家庭氧疗）的相关信息。";
				}
				
				//骨质疏松症
				if (sick.getOsteoporosis() !=null && sick.getOsteoporosis()== 2)
				{
					sickReport += ("".equals(sickReport)?"":"\n") + "您有骨质疏松症，除了遵医嘱用药外，还要注意适当运动、多晒太阳，但在活动过程中应注意安全，避免跌倒等情况的发生。您可关注骨质疏松症的日常护理。";
				}
				vo.setResultTitle("健康状况测评结果");
				vo.setResultMsg(sickReport);
				
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
