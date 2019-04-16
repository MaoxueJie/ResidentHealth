package com.breeze.health.service.impl;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.entity.*;
import com.breeze.health.mapper.UserLivingHabitMapper;
import com.breeze.health.mapper.UserLivingMapper;
import com.breeze.health.mapper.UserLivingMealMapper;
import com.breeze.health.mapper.UserLivingMovementMapper;
import com.breeze.health.mapper.UserPhysiologicalMapper;
import com.breeze.health.service.LivingService;
import com.breeze.health.util.BeanUtils;
import com.github.pagehelper.PageHelper;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

/**
 * @author created by <a href="mailto:chenboning@gomeholdings.com">陈波宁</a>
 * @date 2018/9/24
 */
@Service
public class LivingServiceImpl implements LivingService {
    private Logger logger = LoggerFactory.getLogger(LivingServiceImpl.class);
    
    @Resource
    private UserLivingMapper userLivingMapper;
    @Resource
    private UserLivingHabitMapper userLivingHabitMapper;
    @Resource
    private UserLivingMovementMapper userLivingMovementMapper;
    @Resource
    private UserLivingMealMapper userLivingMealMapper;
    @Resource
    private UserPhysiologicalMapper userPhysiologicalMapper;
    
    @Autowired
	TransactionTemplate transactionTemplate;

    public Result<Void> addOrUpdateLiving(UserLivingVo vo) {
        Result<Void> ret = new Result<Void>();
        try{
        	final Date now = new Date();
        	
        	final UserLiving living= new UserLiving();
        	BeanUtils.copyProperties(vo, living);
        	
        	final UserLivingHabit habit = new UserLivingHabit();
        	BeanUtils.copyProperties(vo, habit);
        	
        	final UserLivingMeal meal = new UserLivingMeal();
        	BeanUtils.copyProperties(vo, meal);
        	if (vo.getPreference()!=null)
        		meal.setPreference(StringUtils.join(vo.getPreference(),","));
        	if (vo.getSpecial()!=null)
        		meal.setSpecial(StringUtils.join(vo.getSpecial(),","));
        	
        	final UserLivingMovement movement = new UserLivingMovement();
        	BeanUtils.copyProperties(vo, movement);
        	
        	if (!Integer.valueOf(1).equals(movement.getModerateMovement()))
        	{
        		movement.setModerateDaysPerWeek(null);
        		movement.setModerateMinutePerDay(null);
        		movement.setModerateMinute(null);
        	}
        	if (!Integer.valueOf(1).equals(movement.getViolentMovement()))
        	{
        		movement.setViolentDaysPerWeek(null);
        		movement.setViolentMinutePerDay(null);
        		movement.setViolentMovementPerDay(null);
        	}
        	if (!Integer.valueOf(1).equals(movement.getWalkMovement()))
        	{
        		movement.setWalkDaysPerWeek(null);
        		movement.setWalkMovementPerDay(null);
        		movement.setWalkMinutePerDay(null);
        	}
        	if (!Integer.valueOf(1).equals(movement.getSittingRecent7Days()))
        	{
        		movement.setSittingDaysRecent7Days(null);
        		movement.setSittingHours(null);
        		movement.setSittingHoursPerDay(null);
        	}
        	
        	ret = transactionTemplate.execute(new TransactionCallback<Result<Void>>() {
				@Override
				public Result<Void> doInTransaction(TransactionStatus arg0) {
					Result<Void> result = new Result<Void>();
					if (living.getId()!=null)
					{
						living.setUpdateTime(now);
						userLivingMapper.updateByPrimaryKeySelective(living);
						UserLivingMealExample mealExample = new UserLivingMealExample();
						mealExample.createCriteria().andLivingIdEqualTo(living.getId());
						List<UserLivingMeal> meals = userLivingMealMapper.selectByExample(mealExample);
						if (meals.size()>0)
						{
							meal.setId(meals.get(0).getId());
							meal.setLivingId(living.getId());
							meal.setUpdateTime(now);
							userLivingMealMapper.updateByPrimaryKeySelective(meal);
						}else
						{
							meal.setLivingId(living.getId());
							meal.setCreateTime(now);
							meal.setUpdateTime(now);
							userLivingMealMapper.insertSelective(meal);
						}
						
						UserLivingMovementExample movementExample = new UserLivingMovementExample();
						movementExample.createCriteria().andLivingIdEqualTo(living.getId());
						List<UserLivingMovement> movements = userLivingMovementMapper.selectByExample(movementExample);
						if (movements.size()>0)
						{
							movement.setId(meals.get(0).getId());
							movement.setLivingId(living.getId());
							movement.setUpdateTime(now);
							userLivingMovementMapper.updateByPrimaryKeySelective(movement);
						}else
						{
							movement.setLivingId(living.getId());
							movement.setCreateTime(now);
							movement.setUpdateTime(now);
							userLivingMovementMapper.insertSelective(movement);
						}
						
						UserLivingHabitExample habitExample = new UserLivingHabitExample();
						habitExample.createCriteria().andLivingIdEqualTo(living.getId());
						List<UserLivingHabit> habits = userLivingHabitMapper.selectByExample(habitExample);
						if (habits.size()>0)
						{
							habit.setId(habits.get(0).getId());
							habit.setLivingId(living.getId());
							habit.setUpdateTime(now);
							userLivingHabitMapper.updateByPrimaryKeySelective(habit);
						}else
						{
							habit.setLivingId(living.getId());
							habit.setCreateTime(now);
							habit.setUpdateTime(now);
							userLivingHabitMapper.insertSelective(habit);
						}
					}else
					{
						living.setUpdateTime(now);
						living.setCreateTime(now);
						userLivingMapper.insertSelective(living);
						
						meal.setLivingId(living.getId());
						meal.setCreateTime(now);
						meal.setUpdateTime(now);
						userLivingMealMapper.insertSelective(meal);
						
						movement.setLivingId(living.getId());
						movement.setCreateTime(now);
						movement.setUpdateTime(now);
						userLivingMovementMapper.insertSelective(movement);
						
						habit.setLivingId(living.getId());
						habit.setCreateTime(now);
						habit.setUpdateTime(now);
						userLivingHabitMapper.insertSelective(habit);
					}
					result.setMessage("提交成功");
					result.setSuccess(true);
					return result;
				}
        	});
            
        }catch (Exception e){
        	logger.error("添加或更新生活习惯异常", e);
			ret.setMessage("更新生活习惯失败");
        }
        return ret;
    }

    @Override
    public Result<UserLivingVo> getLiving(Long userId) {
    	Result<UserLivingVo> ret = new Result<UserLivingVo>();
		try{
			UserLivingExample example = new UserLivingExample();
			example.createCriteria().andUserIdEqualTo(userId);
			example.setOrderByClause(" id desc");
			PageHelper.startPage(1, 1);
			List livings = userLivingMapper.selectByExample(example);
			if (livings!= null && livings.size()>0)
			{
				UserLivingMeal meal= null;
				UserLivingHabit habit = null;
				UserLivingMovement movement = null;
				
				UserLivingVo vo = new UserLivingVo();

				UserLivingMealExample mealExample = new UserLivingMealExample();
				mealExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingMeal> meals = userLivingMealMapper.selectByExample(mealExample);
				if (meals!= null && meals.size()>0)
				{
					meal = meals.get(0);
					BeanUtils.copyProperties(meal, vo);
					if (meal.getPreference()!=null)
					{
						vo.setPreference(meal.getPreference().split(","));
					}
					if (meal.getSpecial()!=null)
					{
						vo.setSpecial(meal.getSpecial().split(","));
					}
				}
				
				UserLivingMovementExample movementExample = new UserLivingMovementExample();
				movementExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingMovement> movements = userLivingMovementMapper.selectByExample(movementExample);
				if (movements!= null && movements.size()>0)
				{
					movement = movements.get(0);
					BeanUtils.copyProperties(movement, vo);
				}
				
				UserLivingHabitExample habitExample = new UserLivingHabitExample();
				habitExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingHabit> habits = userLivingHabitMapper.selectByExample(habitExample);
				if (habits!= null && habits.size()>0)
				{
					habit = habits.get(0);
					BeanUtils.copyProperties(habit, vo);
				}
				
				BeanUtils.copyProperties(livings.get(0), vo);
				
				String report = "";
				if (meal!=null)
				{
					if (meal.getMeal()!=null && meal.getMeal()==2)
					{
						report += "<p>您的饮食习惯有待调整，相关知识请参见饮食指导。</p>";
					}else if(meal.getMeal()!=null && meal.getMeal()==1) {
						report += "<p>您的饮食习惯非常好，继续加油！</p>";
					}
				}
				
				if (movement!=null)
				{
					float violent = ((movement.getViolentMinutePerDay()==null?0:movement.getViolentMinutePerDay())*(movement.getViolentDaysPerWeek()==null?0:movement.getViolentDaysPerWeek()))/60f;
					float moderate = ((movement.getModerateMinutePerDay()==null?0:movement.getModerateMinutePerDay())*(movement.getModerateDaysPerWeek()==null?0:movement.getModerateDaysPerWeek()))/60f;
					float walk =  ((movement.getWalkMinutePerDay()==null?0:movement.getWalkMinutePerDay())*(movement.getWalkDaysPerWeek()==null?0:movement.getWalkDaysPerWeek()))/60f;
					
					moderate += 2*violent + walk/2;
					
					if (moderate<2)
					{
						report += "<p>您的运动量不足，运动形式和时间需要进行适当的调整，相关知识请参见。</p>";
					}else
					{
						report += "<p>您的运动习惯非常好，继续加油！</p>";
					}
				}

				if (habit!=null)
				{
					if (habit.getSmoking()!=null &&  (habit.getSmoking()==2 || habit.getSmoking()==3))
					{
						report += "<p>吸烟有害健康！您有吸烟的习惯，建议您向签约医生或社区护士咨询戒烟的指导，他们将会为您提供个性化的戒烟帮助。</p>";
					}else if(habit.getSmoking()!=null && habit.getSmoking()==4)
					{
						report += "<p>您已成功戒烟，是其他人的榜样，欢迎您在论坛中分享您成功戒烟的经验和感受，以帮助更多的吸烟者戒烟。</p>";
					}
				}
				vo.setResultTitle("生活习惯测评结果");
				vo.setResultMsg(report);
				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setSuccess(true);
			}
		}catch(Exception e)
		{
			logger.error("获取生活习惯异常", e);
			ret.setMessage("获取生活习惯异常");
		}
		return ret;
    }
}
