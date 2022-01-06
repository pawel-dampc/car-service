package com.paweldampc.controller;

import com.paweldampc.domain.Car;
import com.paweldampc.service.AllCarsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AllCarsController {

    AllCarsService allCarsService = new AllCarsService();

    @GetMapping(value = "/all-cars")
    public String getAllCars(Model model) {
        List<Car>allCars = allCarsService.findAll();
        model.addAttribute("allCarsTH", allCars);
        return "all-cars";

    }
}
