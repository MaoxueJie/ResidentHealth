package com.breeze.health.mapper.custom;

import java.util.List;

import com.breeze.health.entity.custom.SickUser;

public interface UserCustomMapper {
	List<SickUser> select(Long doctorId);
}