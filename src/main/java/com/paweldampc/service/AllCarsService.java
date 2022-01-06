package com.paweldampc.service;

import com.paweldampc.domain.Car;
import com.paweldampc.repository.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AllCarsService {


    CarsRepository carsRepository = new CarsRepository();

    public List<Car> findAll() {
        return carsRepository.getCars();
    }

}
