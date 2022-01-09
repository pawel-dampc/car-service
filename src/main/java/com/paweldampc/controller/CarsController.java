package com.paweldampc.controller;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarsController {

    private CarsService carsService;
    private List<Car> cars;

    @Autowired
    public CarsController(CarsService carsService, List<Car> cars) {
        this.carsService = carsService;
        this.cars = cars;
    }

    @GetMapping(value = "/")
    public String getIndex() {
        return "index";
    }

    @GetMapping(value = "/allCarsToRepair")
    public String getCarsToRepair(Model model) {
        List<Car> cars = carsService.findAllToRepair();
        model.addAttribute("allCarsToRepairTH", cars);
        return "allCarsToRepair";
    }

    @GetMapping(value = "/allCarsRepaired")
    public String getCarsRepaired(Model model) {
        List<Car> cars = carsService.findAllRepaired();
        model.addAttribute("allCarsRepairedTH", cars);
        return "allCarsRepaired";
    }

    @GetMapping(value = "/new-car-form")
    public String addCarForm(Model model) {
        model.addAttribute("singleTask", new CarDto());
        return "new-car-form";
    }

    @PostMapping(value = "/new-car")
    public String addCarPost(@ModelAttribute("addNewCarTh") CarDto carDto) {
        carsService.AddCar(carDto);
        return "redirect:/allCarsToRepair";
    }

    @GetMapping(value = "/findPlate")
    public String findByPlate(Model model){
        model.addAttribute("searchPlate");

        return "repairCar";
    }

    @PostMapping(value="/repTrue")
    public String changeBoolean(@ModelAttribute(value = "plate") String plate){
        carsService.findByPlate(plate);
        return "redirect:/allCarsRepaired";
    }


}
