package com.breeze.health.mapper;

import com.breeze.health.entity.WexinAccount;
import com.breeze.health.entity.WexinAccountExample;
import java.util.List;

public interface WexinAccountMapper {
    int countByExample(WexinAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WexinAccount record);

    int insertSelective(WexinAccount record);

    List<WexinAccount> selectByExample(WexinAccountExample example);

    WexinAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WexinAccount record);

    int updateByPrimaryKey(WexinAccount record);
}