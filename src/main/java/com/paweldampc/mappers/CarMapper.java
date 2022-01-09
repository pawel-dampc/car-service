package com.paweldampc.mappers;

import com.paweldampc.domain.Car;
import com.paweldampc.dto.CarDto;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarDto toDTO(Car car){
        CarDto dto = new CarDto();
        dto.setPlateNumber(car.getPlateNumber());
        dto.setName(car.getName());
        dto.setColor(car.getColor());
        dto.setYearOfProduce(car.getYearOfProduce());
        dto.setCreated(car.getCreated());
        dto.setRepaired(car.getRepaired());
        return dto;
    }
}
