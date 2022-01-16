package com.paweldampc.dto;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class CarDto {
    private String plateNumber;
    private String name;
    private String color;
    @Min(value = 1900 ,message = "Podaj prawidłową datę produkcji")
    @Max(value = 2022 ,message = "Podaj prawidłową datę produkcji")
    private int yearOfProduce;
    private LocalDate createdDate;
    private Boolean repaired;

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
        return createdDate = LocalDate.now();
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getRepaired() {
        return repaired = false;
    }

    public void setRepaired(Boolean repaired) {
        this.repaired = repaired;
    }
}
