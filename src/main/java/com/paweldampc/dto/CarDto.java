package com.paweldampc.dto;

import java.time.LocalDate;

public class CarDto {
    private String plateNumber;
    private String name;
    private String color;
    private int yearOfProduce;
    private LocalDate created;
    private Boolean repaired = false;

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

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Boolean getRepaired() {
        return repaired;
    }

    public void setRepaired(Boolean repaired) {
        this.repaired = repaired;
    }
}
