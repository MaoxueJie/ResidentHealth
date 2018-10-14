package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMXueyu;
import com.breeze.health.entity.UserTCMXueyuExample;
import java.util.List;

public interface UserTCMXueyuMapper {
    int countByExample(UserTCMXueyuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMXueyu record);

    int insertSelective(UserTCMXueyu record);

    List<UserTCMXueyu> selectByExample(UserTCMXueyuExample example);

    UserTCMXueyu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMXueyu record);

    int updateByPrimaryKey(UserTCMXueyu record);
}