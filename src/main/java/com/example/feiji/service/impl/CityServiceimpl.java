package com.example.feiji.service.impl;

import com.example.feiji.dao.CityDao;
import com.example.feiji.pojo.City;
import com.example.feiji.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceimpl implements CityService {

    @Autowired
    private CityDao cityMapper;


    @Override
    public List<City> searchOutAllTheCities() {
        return cityMapper.selectAllCity();
    }

    @Override
    public City queryByIdCity(Integer cityId) {
        return cityMapper.selectOneCity( cityId);
    }
}
