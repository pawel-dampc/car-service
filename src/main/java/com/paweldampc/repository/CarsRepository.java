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
        cars.add(new Car("GWE19917", "Audi A3", "Czerwony", 2013, LocalDate.now().minusDays(1), false));
        cars.add(new Car("GA12123", "Seat Toledo", "Srebrny", 2008, LocalDate.now().minusDays(2), false));
        return cars;
    }

    public void addCar(String plate, String name, String color, int year, LocalDate date, Boolean repaired){
        cars.add(new Car(plate, name, color,year,date,repaired));
    }
}
