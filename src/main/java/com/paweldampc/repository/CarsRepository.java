package com.paweldampc.repository;

import com.paweldampc.domain.Car;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsRepository extends Car {

    private List<Car> cars;

    public CarsRepository() {
        this.cars = importCars();
    }

    public List<Car> getCars() {
        return cars;
    }

    private static List<Car> importCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("GWE19917", "Audi A3", "Czerwony", 2013, LocalDate.now().minusDays(1), false));
        cars.add(new Car("GA12123", "Seat Toledo", "Srebrny", 2008, LocalDate.now().minusDays(2), false));
        return cars;
    }
}
