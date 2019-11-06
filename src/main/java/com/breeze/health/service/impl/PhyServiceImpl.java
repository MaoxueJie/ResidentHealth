package com.breeze.health.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.entity.Doctor;
import com.breeze.health.entity.DoctorMsg;
import com.breeze.health.entity.DoctorUserMapping;
import com.breeze.health.entity.DoctorUserMappingExample;
import com.breeze.health.entity.User;
import com.breeze.health.entity.UserLiving;
import com.breeze.health.entity.UserLivingExample;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import com.breeze.health.mapper.DoctorMapper;
import com.breeze.health.mapper.DoctorMsgMapper;
import com.breeze.health.mapper.DoctorUserMappingMapper;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.mapper.UserPhysiologicalMapper;
import com.breeze.health.service.PhyService;
import com.breeze.health.util.BeanUtils;
import com.breeze.health.util.JPushUtil;
import com.github.pagehelper.PageHelper;

@Service("phyService")
public class PhyServiceImpl implements PhyService{
	private static Logger logger = LoggerFactory.getLogger(PhyServiceImpl.class);
	@Autowired
	UserPhysiologicalMapper userPhysiologicalMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	DoctorMsgMapper doctorMsgMapper;
	
	@Autowired
	DoctorUserMappingMapper doctorUserMappingMapper;
	
	@Autowired
	DoctorMapper doctorMapper;
	
	@Override
	public Result<Void> addOrUpdatePhy(UserPhysiologicalVo vo) {
		Result<Void> ret = new Result<Void>();
		try{
			Date now = new Date();
			UserPhysiological phy = new UserPhysiological();
			BeanUtils.copyProperties(vo, phy);
			if (phy.getId()!=null)
			{
				phy.setUpdateTime(now);
				userPhysiologicalMapper.updateByPrimaryKeySelective(phy);
			}else
			{
				phy.setCreateTime(now);
				phy.setUpdateTime(now);
				userPhysiologicalMapper.insert(phy);
			}
			
			User user = userMapper.selectByPrimaryKey(vo.getUserId());
			user.setLastTime(now);
			userMapper.updateByPrimaryKeySelective(user);
			try {
			
				String msgContent = "居民" + user.getMobile()+"指标异常:";
				if (vo.getBloodPressureValLevel()!=null && vo.getBloodPressureValLevel()!=0){
					//血压
					msgContent += "血压值异常;";
				}
				
				if (vo.getAbdominalCircumferenceLevel()!=null && vo.getAbdominalCircumferenceLevel()!=0) {
					//腹围
					msgContent += "腹围异常;";
				}
				
				if (vo.getBmiLevel()!=null && vo.getBmiLevel()!=0)
				{
					//bmi
					msgContent += "BMI异常;";
				}
				
				if (vo.getWHRLevel()!=null && vo.getWHRLevel()!=0)
				{
					//WHR
					msgContent += "腰臀比异常;";
				}
				
				if (vo.getHeartRateLevel()!=null && vo.getHeartRateLevel()!=0)
				{
					//心率
					msgContent += "心率异常;";
				}
				
				if (vo.getBreatheRateLevel()!=null && vo.getBreatheRateLevel()!=0)
				{
					//呼吸频率
					msgContent += "呼吸异常;";
				}
				
				if (vo.getTemperatureLevel()!=null && vo.getTemperatureLevel()!=0)
				{
					//体温
					msgContent += "体温异常;";
				}
				
				if (vo.getBloodSugarVal1Level()!=null && vo.getBloodSugarVal1Level()!=0)
				{
					//空腹血糖
					msgContent += "空腹血糖异常;";
				}
				if (vo.getBloodSugarVal2Level()!=null && vo.getBloodSugarVal2Level()!=0)
				{
					//糖化血红蛋白
					msgContent += "糖化血红蛋白异常;";
				}
				if (vo.getBloodSugarVal3Level()!=null && vo.getBloodSugarVal3Level()!=0)
				{
					//餐后两小时血糖
					msgContent += "餐后两小时血糖异常;";
				}
				if (vo.getBloodSugarVal4Level()!=null && vo.getBloodSugarVal4Level()!=0)
				{
					//随机血糖
					msgContent += "随机血糖异常;";
				}
				
				if (vo.getBloodLipidVal1Level()!=null && vo.getBloodLipidVal1Level()!=0)
				{
					//总胆固醇
					msgContent += "总胆固醇异常;";
				}
				if (vo.getBloodLipidVal2Level()!=null && vo.getBloodLipidVal2Level()!=0)
				{
					//甘油三酯
					msgContent += "甘油三酯异常;";
				}
				if (vo.getBloodLipidVal3Level()!=null && vo.getBloodLipidVal3Level()!=0)
				{
					//高密度脂蛋白胆固醇
					msgContent += "高密度脂蛋白胆固醇异常;";
				}
				if (vo.getBloodLipidVal4Level()!=null && vo.getBloodLipidVal4Level()!=0)
				{
					//低密度脂蛋白胆固醇
					msgContent += "低密度脂蛋白胆固醇异常;";
				}
				
				
				if (vo.getUricAcidValLevel()!=null && vo.getUricAcidValLevel()!=0)
				{
					//尿酸
					msgContent += "尿酸值异常;";
				}
				if (vo.getBloodOxygenValLevel()!=null && vo.getBloodOxygenValLevel()!=0)
				{
					//血氧值
					msgContent += "血氧值异常;";
				}
				
				if (!("居民" + user.getMobile()+"指标异常:").equals(msgContent))
				{
					DoctorUserMappingExample example =  new DoctorUserMappingExample();
					example.createCriteria().andUserIdEqualTo(user.getId());
					List<DoctorUserMapping> mappings = doctorUserMappingMapper.selectByExample(example);
					
					if (mappings!=null && mappings.size()>0)
					{
					  for(DoctorUserMapping mapping:mappings) {
						DoctorMsg msg = new DoctorMsg();
						msg.setTitle("生理指标异常");
						msg.setMsg(msgContent);
						msg.setCreateTime(new Date());
						msg.setDoctorId(mapping.getDoctorId());
						msg.setStatus(0);
						msg.setParam("{\"userId\":"+user.getId()+",\"mobile\":\""+user.getMobile()+"\"}");
						doctorMsgMapper.insert(msg);
						try {
							Doctor doctor = doctorMapper.selectByPrimaryKey(mapping.getDoctorId());
							if (doctor!=null)
								JPushUtil.jPushSendAsy(msg.getTitle(), msg.getMsg(), doctor.getMobile(), msg.getId());
						}catch(Exception e) {
							logger.error("推送异常",e);
						}
					  }
					}
				}
			}catch(Exception e) {
				logger.error("异常监测异常",e);
			}
			
			ret.setMessage("提交成功");
			ret.setSuccess(true);
		}catch(Exception e)
		{
			logger.error("添加或更生理指标异常", e);
			ret.setMessage("更新生理指标失败");
		}
		return ret;
	}

	@Override
	public Result<UserPhysiologicalVo> getPhy(Long userId) {
		Result<UserPhysiologicalVo> ret = new Result<UserPhysiologicalVo>();
		try{
			UserPhysiologicalExample example = new UserPhysiologicalExample();
			
			example.createCriteria().andUserIdEqualTo(userId);
			
			example.setOrderByClause(" id desc");
			
			PageHelper.startPage(1, 1);
			List phys = userPhysiologicalMapper.selectByExample(example);
			if (phys!= null && phys.size()>0)
			{
				UserPhysiological phy = (UserPhysiological)phys.get(0);
				UserPhysiologicalVo vo = new UserPhysiologicalVo();
				BeanUtils.copyProperties(phy, vo);
				
				String report="";
				float bmi = 0;
				try {
					bmi = phy.getWeight()/((phy.getHeight()/100f)*(phy.getHeight()/100f));
				}catch(Exception e)
				{
					logger.error("bmi计算异常", e);
				}
				if (bmi>=28)
				{
					report += "<p>您的体重属于肥胖，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。</p>";
					report += "<p>能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。";
				}else if(bmi>=24)
				{
					report += "<p>您的体重属于超重，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。</p>";
					report += "<p>能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。</p>";
				}
				vo.setResultTitle("生理指标测评结果");
				vo.setResultMsg(report);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("获取生理指标异常", e);
			ret.setMessage("获取生理指标失败");
		}
		return ret;
	}

	private static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	
	@Override
	public Result<List<UserPhysiologicalVo>> getPhyDate(Long userId,Integer type) {
		Result<List<UserPhysiologicalVo>> ret = new Result<List<UserPhysiologicalVo>>();
		try{
			UserPhysiologicalExample example = new UserPhysiologicalExample();
			if (type!=null && type == 1)
			{
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, -7);
				example.createCriteria().andUserIdEqualTo(userId).andCreateTimeGreaterThan(cal.getTime());
			}else if(type!=null && type == 2)
			{
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, -1);
				example.createCriteria().andUserIdEqualTo(userId).andCreateTimeGreaterThan(cal.getTime());
			}else {
				example.createCriteria().andUserIdEqualTo(userId);
			}
			example.setOrderByClause(" id desc");
			List<UserPhysiological> phys = userPhysiologicalMapper.selectByExample(example);
			if (phys!= null && phys.size()>0)
			{
				List<UserPhysiologicalVo> data = new ArrayList<UserPhysiologicalVo>();
				for(UserPhysiological phy:phys) {
					if (data.size()>0)
					{
						UserPhysiologicalVo last = data.get(data.size()-1);
						Calendar ca1 = Calendar.getInstance();
						Calendar ca2 = Calendar.getInstance();
						ca1.setTime(last.getCreateTime());
						ca2.setTime(phy.getCreateTime());
					    if (ca1.get(Calendar.DAY_OF_WEEK)!=ca2.get(Calendar.DAY_OF_WEEK)) {
					    	UserPhysiologicalVo vo = new UserPhysiologicalVo();
					    	BeanUtils.copyProperties(phy, vo);
							vo.setDateStr(format.format(phy.getCreateTime()));
							vo.setCreateTime(phy.getCreateTime());
							data.add(vo);
					    }
					}else
					{
						UserPhysiologicalVo vo = new UserPhysiologicalVo();
						BeanUtils.copyProperties(phy, vo);
						vo.setDateStr(format.format(phy.getCreateTime()));
						vo.setCreateTime(phy.getCreateTime());
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
	public Result<UserPhysiologicalVo> getPhyById(Long id) {
		Result<UserPhysiologicalVo> ret = new Result<UserPhysiologicalVo>();
		try{
			UserPhysiological phy = userPhysiologicalMapper.selectByPrimaryKey(id);
			if (phy!= null)
			{
				UserPhysiologicalVo vo = new UserPhysiologicalVo();
				BeanUtils.copyProperties(phy, vo);
				
				String report="";
				float bmi = 0;
				try {
					bmi = phy.getWeight()/((phy.getHeight()/100f)*(phy.getHeight()/100f));
				}catch(Exception e)
				{
					logger.error("bmi计算异常", e);
				}
				if (bmi>=28)
				{
					report += "<p>您的体重属于肥胖，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。</p>";
					report += "<p>能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。";
				}else if(bmi>=24)
				{
					report += "<p>您的体重属于超重，建议您适当控制饮食、增加运动量，您可以采取饮食日记的形式记录3天的饮食情况，同时上传您的运动记录（或每天运动的步数），我们将根据您的饮食与运动习惯，给出更有针对性的建议。</p>";
					report += "<p>能量摄入低于能量消耗（运动消耗）是减轻体重的基础，您可以利用自己熟悉的软件等工具的帮助，实现减重的目标。但一定要注意营养的均衡，尤其是要保证蛋白质及维生素的摄入。相关的饮食知识详见相关链接运动指导。</p>";
				}
				vo.setResultTitle("生理指标测评结果");
				vo.setResultMsg(report);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("获取生理指标异常", e);
			ret.setMessage("获取生理指标失败");
		}
		return ret;
	}

}
