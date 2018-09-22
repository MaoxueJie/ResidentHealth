package com.breeze.health.mapper;

import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMealExample;
import java.util.List;

public interface UserLivingMealMapper {
    int countByExample(UserLivingMealExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLivingMeal record);

    int insertSelective(UserLivingMeal record);

    List<UserLivingMeal> selectByExample(UserLivingMealExample example);

    UserLivingMeal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLivingMeal record);

    int updateByPrimaryKey(UserLivingMeal record);
}