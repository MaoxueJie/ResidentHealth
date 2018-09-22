package com.breeze.health.mapper;

import com.breeze.health.entity.UserHealthReport;
import com.breeze.health.entity.UserHealthReportExample;
import java.util.List;

public interface UserHealthReportMapper {
    int countByExample(UserHealthReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserHealthReport record);

    int insertSelective(UserHealthReport record);

    List<UserHealthReport> selectByExample(UserHealthReportExample example);

    UserHealthReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserHealthReport record);

    int updateByPrimaryKey(UserHealthReport record);
}