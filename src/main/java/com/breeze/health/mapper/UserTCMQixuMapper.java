package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMQixu;
import com.breeze.health.entity.UserTCMQixuExample;
import java.util.List;

public interface UserTCMQixuMapper {
    int countByExample(UserTCMQixuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMQixu record);

    int insertSelective(UserTCMQixu record);

    List<UserTCMQixu> selectByExample(UserTCMQixuExample example);

    UserTCMQixu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMQixu record);

    int updateByPrimaryKey(UserTCMQixu record);
}