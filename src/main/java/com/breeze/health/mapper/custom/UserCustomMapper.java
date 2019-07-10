package com.breeze.health.mapper.custom;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.breeze.health.entity.custom.SickUser;

public interface UserCustomMapper {
	List<SickUser> selectDoctorSicks(@Param("doctorId")Long doctorId,@Param("mobile")String mobile,@Param("sex")Integer sex,@Param("ageStartDate")Date start,@Param("ageEndDate")Date end,@Param("sicks")Integer sicks[]);
	
	List<SickUser> selectFavoriteSicks(@Param("doctorId")Long doctorId);
}