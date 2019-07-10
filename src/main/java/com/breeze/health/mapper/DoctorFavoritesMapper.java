package com.breeze.health.mapper;

import com.breeze.health.entity.DoctorFavorites;
import com.breeze.health.entity.DoctorFavoritesExample;
import java.util.List;

public interface DoctorFavoritesMapper {
    int countByExample(DoctorFavoritesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DoctorFavorites record);

    int insertSelective(DoctorFavorites record);

    List<DoctorFavorites> selectByExample(DoctorFavoritesExample example);

    DoctorFavorites selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DoctorFavorites record);

    int updateByPrimaryKey(DoctorFavorites record);
}