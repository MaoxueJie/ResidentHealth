package com.breeze.health.mapper;

import com.breeze.health.entity.UserBaseInfo;
import com.breeze.health.entity.UserBaseInfoExample;
import java.util.List;

public interface UserBaseInfoMapper {
    int countByExample(UserBaseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    List<UserBaseInfo> selectByExample(UserBaseInfoExample example);

    UserBaseInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}