package com.paweldampc.service;

import com.paweldampc.dto.CarDto;
import com.paweldampc.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewCarService {

    CarsRepository carsRepository = new CarsRepository();

    @Autowired
    public NewCarService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }
    public void AddCar(CarDto carDto){
        carsRepository.addCar(carDto.getPlateNumber(), carDto.getName(), carDto.getColor(), carDto.getYearOfProduce(),carDto.getCreated(),carDto.getRepaired());
    }

}
