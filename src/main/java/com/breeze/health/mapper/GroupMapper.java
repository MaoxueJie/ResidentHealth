package com.breeze.health.mapper;

import com.breeze.health.entity.Group;
import com.breeze.health.entity.GroupExample;
import java.util.List;

public interface GroupMapper {
    int countByExample(GroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}