package com.breeze.health.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.breeze.health.entity.custom.SickUser;

public interface UserCustomMapper {
	List<SickUser> select(@Param("doctorId")Long doctorId,@Param("mobile")String mobile);
}