package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMTebing;
import com.breeze.health.entity.UserTCMTebingExample;
import java.util.List;

public interface UserTCMTebingMapper {
    int countByExample(UserTCMTebingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMTebing record);

    int insertSelective(UserTCMTebing record);

    List<UserTCMTebing> selectByExample(UserTCMTebingExample example);

    UserTCMTebing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMTebing record);

    int updateByPrimaryKey(UserTCMTebing record);
}