package com.paweldampc.service;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.mappers.CarMapper;
import com.paweldampc.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsService {

    private CarsRepository carsRepository;
    private CarMapper carMapper;

    @Autowired
    public CarsService(CarsRepository carsRepository, CarMapper carMapper) {
        this.carsRepository = carsRepository;
        this.carMapper = carMapper;
    }

    public List<Car> findAllToRepair() {
        List<Car> allCarsToRepair = carsRepository.getCars().stream()
                .filter(car -> car.getRepaired().equals(false))
                .sorted(Comparator.comparing(Car::getCreatedDate))
                .collect(Collectors.toList());
        return allCarsToRepair;
    }

    public List<Car> findAllRepaired() {
        List<Car> allCarsRepaired = carsRepository.getCars().stream()
                .filter(car -> car.getRepaired().equals(true))
                .sorted(Comparator.comparing(Car::getCreatedDate))
                .collect(Collectors.toList());
        return allCarsRepaired;
    }

    public void AddCar(CarDto carDto) {
        carsRepository.addCar(carDto.getPlateNumber(), carDto.getName(), carDto.getColor(), carDto.getYearOfProduce(), carDto.getCreatedDate(), carDto.getRepaired());
    }

    public List<Car> findByPlate(String plate) {
        carsRepository.getCars().stream()
                .filter(car -> car.getPlateNumber().equals(plate.toUpperCase()))
                .forEach(car -> {
                    car.setRepaired(true);
                    car.setCreatedDate(LocalDate.now());});
        return null;
    }
}
