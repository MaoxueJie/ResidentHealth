package com.breeze.health.mapper;

import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserLivingMovementExample;
import java.util.List;

public interface UserLivingMovementMapper {
    int countByExample(UserLivingMovementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLivingMovement record);

    int insertSelective(UserLivingMovement record);

    List<UserLivingMovement> selectByExample(UserLivingMovementExample example);

    UserLivingMovement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLivingMovement record);

    int updateByPrimaryKey(UserLivingMovement record);
}