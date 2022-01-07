package com.paweldampc.controller;

import com.paweldampc.service.RepairCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RepairCarController {

    private RepairCarService repairCarService;

    @Autowired
    public RepairCarController(RepairCarService repairCarService) {
        this.repairCarService = repairCarService;
    }

    public String getCar
   /* @GetMapping("/products/{id}")
    public String getProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.find(id));
        return "product";*/
}
