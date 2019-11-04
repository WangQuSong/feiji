package com.example.feiji.service;


import com.example.feiji.pojo.Flight;

import java.util.List;

public interface FlightService {


    public List<Flight> conditionCheckFlight(Integer departureCity,Integer arrivalCity);
}
