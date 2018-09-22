package com.breeze.health.mapper;

import com.breeze.health.entity.UserPsychologicalGAD7;
import com.breeze.health.entity.UserPsychologicalGAD7Example;
import java.util.List;

public interface UserPsychologicalGAD7Mapper {
    int countByExample(UserPsychologicalGAD7Example example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPsychologicalGAD7 record);

    int insertSelective(UserPsychologicalGAD7 record);

    List<UserPsychologicalGAD7> selectByExample(UserPsychologicalGAD7Example example);

    UserPsychologicalGAD7 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPsychologicalGAD7 record);

    int updateByPrimaryKey(UserPsychologicalGAD7 record);
}