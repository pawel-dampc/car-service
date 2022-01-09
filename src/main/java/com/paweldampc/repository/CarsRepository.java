package com.paweldampc.repository;

import com.paweldampc.domain.Car;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsRepository {

    private List<Car> cars;

    public CarsRepository() {
        this.cars = importCars();
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> importCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("GWE19917".toUpperCase(), "Audi A3".toUpperCase(), "Czerwony".toUpperCase(), 2013, LocalDate.now().minusDays(1), false));
        cars.add(new Car("GA12123".toUpperCase(), "Seat Toledo".toUpperCase(), "Srebrny".toUpperCase(), 2008, LocalDate.now().minusDays(2), true));
        return cars;
    }

    public void addCar(String plate, String name, String color, int year, LocalDate date, Boolean repaired){
        cars.add(new Car(plate.toUpperCase(), name.toUpperCase(), color.toUpperCase(),year,date,repaired));
    }
}
