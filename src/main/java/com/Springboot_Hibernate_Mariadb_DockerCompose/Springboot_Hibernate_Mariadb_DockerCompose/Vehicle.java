package com.Springboot_Hibernate_Mariadb_DockerCompose.Springboot_Hibernate_Mariadb_DockerCompose;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="vehicle_data")
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int carId;
    String carName;
    String carType;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
