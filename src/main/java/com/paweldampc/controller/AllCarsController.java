package com.paweldampc.controller;

import com.paweldampc.domain.Car;
import com.paweldampc.service.AllCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AllCarsController {

    private AllCarsService allCarsService;

    @Autowired
    public AllCarsController(AllCarsService allCarsService) {
        this.allCarsService = allCarsService;
    }

    @GetMapping(value = "/all-cars")
    public String getAllCars(Model model) {
        List<Car> allCars = allCarsService.findAll();
        model.addAttribute("allCarsTH", allCars);
        return "all-cars";

    }
}
