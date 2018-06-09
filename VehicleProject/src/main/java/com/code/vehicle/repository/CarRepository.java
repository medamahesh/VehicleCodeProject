package com.code.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.code.vehicle.model.Car;
import com.code.vehicle.model.Vehicle;

public interface CarRepository extends VehicleBaseRepository<Car>{
    

}