package com.paweldampc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllCarsController {

    @GetMapping(value = "/all-cars")
    public String getAllCars(){
        return "all-cars";
    }
}
