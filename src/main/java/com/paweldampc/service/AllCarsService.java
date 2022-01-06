package com.paweldampc.service;

import com.paweldampc.domain.Car;
import com.paweldampc.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AllCarsService {


    CarsRepository carsRepository = new CarsRepository();

    @Autowired
    public AllCarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public List<Car> findAll() {
        List<Car> allCars = new ArrayList<>();
        allCars.addAll(carsRepository.getCars());
        return allCars;
    }

}
