package com.code.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.code.vehicle.model.Vehicle;

@NoRepositoryBean
public interface VehicleBaseRepository<T extends Vehicle> extends CrudRepository<T, Integer> {
    
  /*  List<T> findByVehicleType(String type);
*/
}
