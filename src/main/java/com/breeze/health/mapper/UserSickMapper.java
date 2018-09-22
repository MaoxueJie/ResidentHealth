package com.breeze.health.mapper;

import com.breeze.health.entity.UserSick;
import com.breeze.health.entity.UserSickExample;
import java.util.List;

public interface UserSickMapper {
    int countByExample(UserSickExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSick record);

    int insertSelective(UserSick record);

    List<UserSick> selectByExample(UserSickExample example);

    UserSick selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserSick record);

    int updateByPrimaryKey(UserSick record);
}