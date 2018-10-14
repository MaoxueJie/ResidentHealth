package com.breeze.health.mapper;

import com.breeze.health.entity.UserPsychologicalSuicide;
import com.breeze.health.entity.UserPsychologicalSuicideExample;
import java.util.List;

public interface UserPsychologicalSuicideMapper {
    int countByExample(UserPsychologicalSuicideExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPsychologicalSuicide record);

    int insertSelective(UserPsychologicalSuicide record);

    List<UserPsychologicalSuicide> selectByExample(UserPsychologicalSuicideExample example);

    UserPsychologicalSuicide selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPsychologicalSuicide record);

    int updateByPrimaryKey(UserPsychologicalSuicide record);
}