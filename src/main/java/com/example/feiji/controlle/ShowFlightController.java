package com.example.feiji.controlle;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.feiji.pojo.City;
import com.example.feiji.pojo.Flight;
import com.example.feiji.service.CityService;
import com.example.feiji.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;


@Controller
public class ShowFlightController {

        @Autowired
        private CityService  cityService;
        @Autowired
        private FlightService flightService;




        @RequestMapping("show/citydata")
        @ResponseBody
        public List<City> cityData(){

            List<City> cities = cityService.searchOutAllTheCities();

            return cities;
        }





    @RequestMapping("show/queryflight")
    @ResponseBody
    public List queryFlight( Integer departureCity, Integer arrivalCity){
        List list = new ArrayList();
        City departure = cityService.queryByIdCity(departureCity);
        City arrival = cityService.queryByIdCity(arrivalCity);

        List<Flight> flights = flightService.conditionCheckFlight(departureCity, arrivalCity);
        System.out.println(flights);

        list.add(flights);
        list.add(departure);
        list.add(arrival);

        return list;
    }

}
