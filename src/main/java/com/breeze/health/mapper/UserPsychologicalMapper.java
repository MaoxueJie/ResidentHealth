package com.breeze.health.mapper;

import com.breeze.health.entity.UserPsychological;
import com.breeze.health.entity.UserPsychologicalExample;
import java.util.List;

public interface UserPsychologicalMapper {
    int countByExample(UserPsychologicalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPsychological record);

    int insertSelective(UserPsychological record);

    List<UserPsychological> selectByExample(UserPsychologicalExample example);

    UserPsychological selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPsychological record);

    int updateByPrimaryKey(UserPsychological record);
}