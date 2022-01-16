package com.paweldampc.controller;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
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

    @GetMapping("/allCarsToRepair/{plate}")
    public String getByPlateNumber(@PathVariable String plate, Model model) {
        model.addAttribute("findPlate", carsService.findByPlate(plate));
        return "redirect:/allCarsRepaired";

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
    public String addCarPost(@Valid @ModelAttribute("addNewCarTh") CarDto carDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "new-car-form";
        }
        carsService.AddCar(carDto);
        return "redirect:/allCarsToRepair";
    }

    @GetMapping(value = "/findPlate")
    public String findByPlate(Model model) {
        model.addAttribute("searchPlate", new CarDto());
        return "repairCar";
    }

    @PostMapping(value = "/repTrue")
    public String changeBoolean(@ModelAttribute("searchPlate") CarDto carDto) {
        carsService.findByPlate(carDto.getPlateNumber());
        return "redirect:/allCarsRepaired";
    }


}
