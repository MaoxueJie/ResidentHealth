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
        	
        	final UserLivingMovement movement = new UserLivingMovement();
        	BeanUtils.copyProperties(vo, movement);
        	
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
				UserLivingVo vo = new UserLivingVo();

				UserLivingMealExample mealExample = new UserLivingMealExample();
				mealExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingMeal> meals = userLivingMealMapper.selectByExample(mealExample);
				if (meals!= null && meals.size()>0)
				{
					BeanUtils.copyProperties(meals.get(0), vo);
				}
				
				UserLivingMovementExample movementExample = new UserLivingMovementExample();
				movementExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingMovement> movements = userLivingMovementMapper.selectByExample(movementExample);
				if (movements!= null && movements.size()>0)
				{
					BeanUtils.copyProperties(movements.get(0), vo);
				}
				
				UserLivingHabitExample habitExample = new UserLivingHabitExample();
				habitExample.createCriteria().andLivingIdEqualTo(((UserLiving)livings.get(0)).getId());
				List<UserLivingHabit> habits = userLivingHabitMapper.selectByExample(habitExample);
				if (habits!= null && habits.size()>0)
				{
					BeanUtils.copyProperties(habits.get(0), vo);
				}
				
				BeanUtils.copyProperties(livings.get(0), vo);

				ret.setSuccess(true);
				ret.setData(vo);
			}else
			{
				ret.setMessage("未获取到生活习惯");
			}
		}catch(Exception e)
		{
			logger.error("获取生活习惯异常", e);
			ret.setMessage("获取生活习惯异常");
		}
		return ret;
    }
}
