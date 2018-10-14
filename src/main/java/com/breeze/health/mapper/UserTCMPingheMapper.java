package com.breeze.health.mapper;

import com.breeze.health.entity.UserTCMPinghe;
import com.breeze.health.entity.UserTCMPingheExample;
import java.util.List;

public interface UserTCMPingheMapper {
    int countByExample(UserTCMPingheExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTCMPinghe record);

    int insertSelective(UserTCMPinghe record);

    List<UserTCMPinghe> selectByExample(UserTCMPingheExample example);

    UserTCMPinghe selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTCMPinghe record);

    int updateByPrimaryKey(UserTCMPinghe record);
}