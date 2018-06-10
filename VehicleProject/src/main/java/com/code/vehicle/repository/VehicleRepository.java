package com.code.vehicle.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.code.vehicle.model.Vehicle;

@Transactional
public interface VehicleRepository extends VehicleBaseRepository<Vehicle>{

	@Transactional
    @Modifying
    @Query("DELETE FROM Vehicle WHERE  ROWNUM() < 6 order by createdDate")
	void deleteVehicle();
}
