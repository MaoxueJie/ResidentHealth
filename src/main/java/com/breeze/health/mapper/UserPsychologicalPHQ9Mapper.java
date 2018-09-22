package com.breeze.health.mapper;

import com.breeze.health.entity.UserPsychologicalPHQ9;
import com.breeze.health.entity.UserPsychologicalPHQ9Example;
import java.util.List;

public interface UserPsychologicalPHQ9Mapper {
    int countByExample(UserPsychologicalPHQ9Example example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPsychologicalPHQ9 record);

    int insertSelective(UserPsychologicalPHQ9 record);

    List<UserPsychologicalPHQ9> selectByExample(UserPsychologicalPHQ9Example example);

    UserPsychologicalPHQ9 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPsychologicalPHQ9 record);

    int updateByPrimaryKey(UserPsychologicalPHQ9 record);
}