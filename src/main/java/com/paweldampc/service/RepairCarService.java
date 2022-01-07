package com.paweldampc.service;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairCarService {

    private static CarsRepository repository = new CarsRepository();

    @Autowired
    public RepairCarService(CarsRepository repository) {
        this.repository = repository;
    }

    public CarDto find(String plateNumber) {
        repository
        return mapper.toDto(product);
    }
}
