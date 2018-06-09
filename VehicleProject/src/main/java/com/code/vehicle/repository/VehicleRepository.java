package com.code.vehicle.repository;

import javax.transaction.Transactional;

import com.code.vehicle.model.Vehicle;

@Transactional
public interface VehicleRepository extends VehicleBaseRepository<Vehicle>{

}
