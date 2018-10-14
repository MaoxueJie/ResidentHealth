package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMYinxu;
import com.breeze.health.entity.UserTCMYinxuExample;
import java.util.List;

public interface UserTCMYinxuMapper {
    int countByExample(UserTCMYinxuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMYinxu record);

    int insertSelective(UserTCMYinxu record);

    List<UserTCMYinxu> selectByExample(UserTCMYinxuExample example);

    UserTCMYinxu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMYinxu record);

    int updateByPrimaryKey(UserTCMYinxu record);
}