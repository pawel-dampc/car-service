package com.paweldampc.controller;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.service.NewCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewCarController {

    private NewCarService newCarService;
    private List<Car> cars;

    @Autowired
    public NewCarController(NewCarService newCarService, List<Car> cars) {
        this.newCarService = newCarService;
        this.cars = cars;
    }

    @GetMapping(value = "/new-car-form")
    public String addCarForm(Model model) {
        model.addAttribute("singleTask", new CarDto());
        return "new-car-form";
    }

    @PostMapping(value = "/new-car")
    public String addCarPost(@ModelAttribute("addNewCarTh") CarDto carDto) {
        newCarService.AddCar(carDto);
        return "new-car-form";
    }
}
