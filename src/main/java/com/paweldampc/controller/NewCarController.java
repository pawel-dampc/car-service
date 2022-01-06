package com.paweldampc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewCarController {

    @GetMapping(value = "/new-car")
    public String addCar() {
        return "new-car";
    }
}
