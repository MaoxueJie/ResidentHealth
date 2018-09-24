package com.breeze.health.service.impl;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.*;
import com.breeze.health.mapper.UserLivingHabitMapper;
import com.breeze.health.mapper.UserLivingMealMapper;
import com.breeze.health.mapper.UserLivingMovementMapper;
import com.breeze.health.mapper.UserPhysiologicalMapper;
import com.breeze.health.service.LivingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author created by <a href="mailto:chenboning@gomeholdings.com">陈波宁</a>
 * @date 2018/9/24
 */
@Service
public class LivingServiceImpl implements LivingService {
    private Logger logger = LoggerFactory.getLogger(LivingServiceImpl.class);
    @Resource
    private UserLivingHabitMapper userLivingHabitMapper;
    @Resource
    private UserLivingMovementMapper userLivingMovementMapper;
    @Resource
    private UserLivingMealMapper userLivingMealMapper;
    @Resource
    private UserPhysiologicalMapper userPhysiologicalMapper;

    public Result<String> addLivingHabit(UserLivingHabit habit) {
        Result<String> result = new Result<String>();
        String message = "保存生活习惯--嗜好失败,%s";
        try{
            userLivingHabitMapper.insert(habit);
            message = "保存生活习惯--嗜好成功....";
            result.setSuccess(true);
            result.setData(message);
            result.setMessage(message);
        }catch (Exception e){
            logger.error("保存生活习惯--嗜好失败，{}",e.getMessage());
            logger.error("{},{}",e.getMessage(),e);
            result.setMessage(String.format(message,e.getMessage()));
            throw new RuntimeException(String.format(message,e.getMessage()));
        }
        return result;
    }

    @Override
    public Result<UserLivingHabit> getLivingHabit(UserLivingHabit habit) {
        Result<UserLivingHabit> result =  new Result<UserLivingHabit>();
        try{
            UserLivingHabitExample example = new UserLivingHabitExample() ;
            example.createCriteria();
            if(habit.getUserId()!=null){
                example.getOredCriteria().get(0).andUserIdEqualTo(habit.getUserId());
            }
            example.setOrderByClause("  id desc ");
            example.setLimit("1");
            List<UserLivingHabit> list = userLivingHabitMapper.selectByExample(example);
            if(list!=null&&!list.isEmpty()&&list.size()>0){
                result.setData(list.get(0));
            }
            result.setSuccess(true);
        }catch (Exception e){
            logger.error("{},{}",e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result<String> addLivingMovement(UserLivingMovement movement) {
        Result<String> result = new Result<String>();
        String message = "保存生活习惯--运动失败,%s";
        try{
            userLivingMovementMapper.insert(movement);
            message = "保存生活习惯--运动成功....";
            result.setSuccess(true);
            result.setData(message);
            result.setMessage(message);
        }catch (Exception e){
            logger.error("保存生活习惯--运动失败，{}",e.getMessage());
            logger.error("{},{}",e.getMessage(),e);
            result.setMessage(String.format(message,e.getMessage()));
            throw new RuntimeException(String.format(message,e.getMessage()));
        }
        return result;
    }

    @Override
    public Result<UserLivingMovement> getUserLivingMovement(UserLivingMovement movement) {
        Result<UserLivingMovement> result =  new Result<UserLivingMovement>();
        try{
            UserLivingMovementExample example = new UserLivingMovementExample() ;
            example.createCriteria();
            if(movement.getUserId()!=null){
                example.getOredCriteria().get(0).andUserIdEqualTo(movement.getUserId());
            }
            example.setOrderByClause("  id desc ");
            example.setLimit("1");
            List<UserLivingMovement> list = userLivingMovementMapper.selectByExample(example);
            if(list!=null&&!list.isEmpty()&&list.size()>0){
                result.setData(list.get(0));
            }
            result.setSuccess(true);
        }catch (Exception e){
            logger.error("{},{}",e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result<String> addUserLivingMeal(UserLivingMeal meal) {
        Result<String> result = new Result<String>();
        String message = "保存生活习惯--饮食失败,%s";
        try{
            userLivingMealMapper.insert(meal);
            message = "保存生活习惯--饮食成功....";
            result.setSuccess(true);
            result.setData(message);
            result.setMessage(message);
        }catch (Exception e){
            logger.error("保存生活习惯--饮食失败，{}",e.getMessage());
            logger.error("{},{}",e.getMessage(),e);
            result.setMessage(String.format(message,e.getMessage()));
            throw new RuntimeException(String.format(message,e.getMessage()));
        }
        return result;
    }

    @Override
    public Result<UserLivingMeal> getUserLivingMeal(UserLivingMeal meal) {
        Result<UserLivingMeal> result =  new Result<UserLivingMeal>();
        try{
            UserLivingMealExample example = new UserLivingMealExample() ;
            example.createCriteria();
            example.setOrderByClause("  id desc ");
            if(meal.getUserId()!=null){
                example.getOredCriteria().get(0).andUserIdEqualTo(meal.getUserId());
            }
            example.setLimit("1");
            List<UserLivingMeal> list = userLivingMealMapper.selectByExample(example);
            if(list!=null&&!list.isEmpty()&&list.size()>0){
                result.setData(list.get(0));
            }
            result.setSuccess(true);
        }catch (Exception e){
            logger.error("{},{}",e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result<String> addUserPhysiological(UserPhysiological physiological) {
        Result<String> result = new Result<String>();
        String message = "保存生理指标--相关指标失败,%s";
        try{
            userPhysiologicalMapper.insert(physiological);
            message = "保存生理指标--相关指标成功....";
            result.setSuccess(true);
            result.setData(message);
            result.setMessage(message);
        }catch (Exception e){
            logger.error("保存生理指标--相关指标失败，{}",e.getMessage());
            logger.error("{},{}",e.getMessage(),e);
            result.setMessage(String.format(message,e.getMessage()));
            throw new RuntimeException(String.format(message,e.getMessage()));
        }
        return result;
    }

    @Override
    public Result<UserPhysiological> getUserPhysiological(UserPhysiological physiological) {
        Result<UserPhysiological> result =  new Result<UserPhysiological>();
        try{
            UserPhysiologicalExample example = new UserPhysiologicalExample() ;
            example.createCriteria();
            example.setOrderByClause("  id desc ");
            if(physiological.getUserId()!=null){
                example.getOredCriteria().get(0).andUserIdEqualTo(physiological.getUserId());
            }
            example.setLimit("1");
            List<UserPhysiological> list = userPhysiologicalMapper.selectByExample(example);
            if(list!=null&&!list.isEmpty()&&list.size()>0){
                result.setData(list.get(0));
            }
            result.setSuccess(true);
        }catch (Exception e){
            logger.error("{},{}",e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
}
