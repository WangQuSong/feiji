package com.example.feiji.controlle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {

    @RequestMapping("showFlight")
    public String showFlight(){

        return "showFlight";
    }

}
