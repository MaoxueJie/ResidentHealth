package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMTanshi;
import com.breeze.health.entity.UserTCMTanshiExample;
import java.util.List;

public interface UserTCMTanshiMapper {
    int countByExample(UserTCMTanshiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMTanshi record);

    int insertSelective(UserTCMTanshi record);

    List<UserTCMTanshi> selectByExample(UserTCMTanshiExample example);

    UserTCMTanshi selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMTanshi record);

    int updateByPrimaryKey(UserTCMTanshi record);
}