package com.breeze.health.mapper;

import com.breeze.health.entity.UserLiving;
import com.breeze.health.entity.UserLivingExample;
import java.util.List;

public interface UserLivingMapper {
    int countByExample(UserLivingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLiving record);

    int insertSelective(UserLiving record);

    List<UserLiving> selectByExample(UserLivingExample example);

    UserLiving selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLiving record);

    int updateByPrimaryKey(UserLiving record);
}