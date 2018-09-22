package com.breeze.health.mapper;

import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.entity.UserPhysiologicalExample;
import java.util.List;

public interface UserPhysiologicalMapper {
    int countByExample(UserPhysiologicalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPhysiological record);

    int insertSelective(UserPhysiological record);

    List<UserPhysiological> selectByExample(UserPhysiologicalExample example);

    UserPhysiological selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPhysiological record);

    int updateByPrimaryKey(UserPhysiological record);
}