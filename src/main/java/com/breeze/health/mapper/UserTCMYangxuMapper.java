package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMYangxu;
import com.breeze.health.entity.UserTCMYangxuExample;
import java.util.List;

public interface UserTCMYangxuMapper {
    int countByExample(UserTCMYangxuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMYangxu record);

    int insertSelective(UserTCMYangxu record);

    List<UserTCMYangxu> selectByExample(UserTCMYangxuExample example);

    UserTCMYangxu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMYangxu record);

    int updateByPrimaryKey(UserTCMYangxu record);
}