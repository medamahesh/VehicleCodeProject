package com.code.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.code.vehicle.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
    
    List<Vehicle> findByVehicleType(String type);

}
