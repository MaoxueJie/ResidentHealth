package com.breeze.health.mapper;

import com.breeze.health.entity.DoctorMsg;
import com.breeze.health.entity.DoctorMsgExample;
import java.util.List;

public interface DoctorMsgMapper {
    int countByExample(DoctorMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DoctorMsg record);

    int insertSelective(DoctorMsg record);

    List<DoctorMsg> selectByExample(DoctorMsgExample example);

    DoctorMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DoctorMsg record);

    int updateByPrimaryKey(DoctorMsg record);
}