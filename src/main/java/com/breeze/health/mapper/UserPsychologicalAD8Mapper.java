package com.breeze.health.mapper;

import com.breeze.health.entity.UserPsychologicalAD8;
import com.breeze.health.entity.UserPsychologicalAD8Example;
import java.util.List;

public interface UserPsychologicalAD8Mapper {
    int countByExample(UserPsychologicalAD8Example example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPsychologicalAD8 record);

    int insertSelective(UserPsychologicalAD8 record);

    List<UserPsychologicalAD8> selectByExample(UserPsychologicalAD8Example example);

    UserPsychologicalAD8 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPsychologicalAD8 record);

    int updateByPrimaryKey(UserPsychologicalAD8 record);
}