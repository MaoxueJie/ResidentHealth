package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMShire;
import com.breeze.health.entity.UserTCMShireExample;
import java.util.List;

public interface UserTCMShireMapper {
    int countByExample(UserTCMShireExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMShire record);

    int insertSelective(UserTCMShire record);

    List<UserTCMShire> selectByExample(UserTCMShireExample example);

    UserTCMShire selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMShire record);

    int updateByPrimaryKey(UserTCMShire record);
}