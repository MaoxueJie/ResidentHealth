package com.breeze.health.mapper;

import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingHabitExample;
import java.util.List;

public interface UserLivingHabitMapper {
    int countByExample(UserLivingHabitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLivingHabit record);

    int insertSelective(UserLivingHabit record);

    List<UserLivingHabit> selectByExample(UserLivingHabitExample example);

    UserLivingHabit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLivingHabit record);

    int updateByPrimaryKey(UserLivingHabit record);
}