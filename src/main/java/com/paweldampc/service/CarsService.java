package com.paweldampc.service;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import com.paweldampc.mappers.CarMapper;
import com.paweldampc.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<Car> allCarsToRepair = carsRepository.getCars().stream().filter(car -> car.getRepaired().equals(false)).collect(Collectors.toList());
        return allCarsToRepair;
    }

    public List<Car> findAllRepaired() {
        List<Car> allCarsRepaired = carsRepository.getCars().stream().filter(car -> car.getRepaired().equals(true)).collect(Collectors.toList());
        return allCarsRepaired;
    }

    public void AddCar(CarDto carDto) {
        carsRepository.addCar(carDto.getPlateNumber(), carDto.getName(), carDto.getColor(), carDto.getYearOfProduce(), carDto.getCreated(), carDto.getRepaired());
    }


    /*    public
        public CarDto find (String plate){
            Car car = carsRepository.;
            return carMapper.toDTO(car);*/
//    }
    public void findByPlate(String plate) {
        carsRepository.getCars().stream().filter(car -> car.getPlateNumber().equals(plate.toUpperCase())).forEach(car -> car.setRepaired(true));
    }

//    public void findByNumberPlate(String plateNumber){
//        carsRepository.getCars().stream().filter(car -> car.getPlateNumber().toUpperCase().contains(plateNumber.toUpperCase())).collect(Collectors.toList());
//
//    }
}
