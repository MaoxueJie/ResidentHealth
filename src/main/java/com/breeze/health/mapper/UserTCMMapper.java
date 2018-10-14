package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCM;
import com.breeze.health.entity.UserTCMExample;
import java.util.List;

public interface UserTCMMapper {
    int countByExample(UserTCMExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCM record);

    int insertSelective(UserTCM record);

    List<UserTCM> selectByExample(UserTCMExample example);

    UserTCM selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCM record);

    int updateByPrimaryKey(UserTCM record);
}