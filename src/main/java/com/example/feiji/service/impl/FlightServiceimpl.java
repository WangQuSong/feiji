package com.example.feiji.service.impl;

import com.example.feiji.dao.FlightDao;
import com.example.feiji.pojo.Flight;
import com.example.feiji.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceimpl implements FlightService {

    @Autowired
    private FlightDao flightDao;

    @Override
    public List<Flight> conditionCheckFlight(Integer departureCity, Integer arrivalCity) {


        return flightDao.conditionSelectFlight(departureCity,arrivalCity);
    }
}
