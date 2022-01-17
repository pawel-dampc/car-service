package com.paweldampc.domain;

import java.time.LocalDate;

public class Car {

    private String plateNumber;
    private String name;
    private String color;
    private int yearOfProduce;
    private LocalDate createdDate;
    private Boolean repaired;

    public Car(String plateNumber, String name, String color, int yearOfProduce) {
        this.plateNumber = plateNumber;
        this.name = name;
        this.color = color;
        this.yearOfProduce = yearOfProduce;

    }

    public Car(String plateNumber, String name, String color, int yearOfProduce, LocalDate createdDate, Boolean repaired) {
        this.plateNumber = plateNumber;
        this.name = name;
        this.color = color;
        this.yearOfProduce = yearOfProduce;
        this.createdDate = createdDate;
        this.repaired = repaired;
    }

    public Car() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getRepaired() {
        return repaired;
    }

    public void setRepaired(Boolean repaired) {
        this.repaired = repaired;
    }
}