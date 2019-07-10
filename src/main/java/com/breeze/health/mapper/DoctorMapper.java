package com.breeze.health.mapper;

import com.breeze.health.entity.Doctor;
import com.breeze.health.entity.DoctorExample;
import java.util.List;

public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}