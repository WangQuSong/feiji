package com.example.feiji.dao;

import com.example.feiji.pojo.City;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface CityDao {



    List<City> selectAllCity();

   City selectOneCity(@Param("cid") Integer cityId);

}
