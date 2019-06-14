package com.breeze.health.mapper;

import com.breeze.health.entity.DoctorUserMapping;
import com.breeze.health.entity.DoctorUserMappingExample;
import java.util.List;

public interface DoctorUserMappingMapper {
    int countByExample(DoctorUserMappingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorUserMapping record);

    int insertSelective(DoctorUserMapping record);

    List<DoctorUserMapping> selectByExample(DoctorUserMappingExample example);

    DoctorUserMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DoctorUserMapping record);

    int updateByPrimaryKey(DoctorUserMapping record);
}