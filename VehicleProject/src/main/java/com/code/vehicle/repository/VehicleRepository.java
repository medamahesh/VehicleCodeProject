package com.code.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.vehicle.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    
    List<Vehicle> findByVehicleType(String type);

}
