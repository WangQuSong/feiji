package com.example.feiji.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FlightDao {

    List<com.example.feiji.pojo.Flight> conditionSelectFlight(@Param("startid")Integer departureCity, @Param("arriveid")Integer arrivalCity);


}
