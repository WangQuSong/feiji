package com.example.feiji.service;

import com.example.feiji.pojo.City;

import java.util.List;

public interface CityService {

  List<City> searchOutAllTheCities();

 City queryByIdCity(Integer cityId);

}
