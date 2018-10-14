package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMQiyu;
import com.breeze.health.entity.UserTCMQiyuExample;
import java.util.List;

public interface UserTCMQiyuMapper {
    int countByExample(UserTCMQiyuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMQiyu record);

    int insertSelective(UserTCMQiyu record);

    List<UserTCMQiyu> selectByExample(UserTCMQiyuExample example);

    UserTCMQiyu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMQiyu record);

    int updateByPrimaryKey(UserTCMQiyu record);
}