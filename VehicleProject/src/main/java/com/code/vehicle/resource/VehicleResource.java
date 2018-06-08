package com.code.vehicle.resource;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.vehicle.model.Vehicle;
import com.code.vehicle.repository.VehicleRepository;

@RestController
@RequestMapping("/rest/users")
public class VehicleResource {

    
    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping("/all")
    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Vehicle> getVehicle(@PathVariable("name") final String name) {
        return vehicleRepository.findByVehicleType(name);

    }

    @GetMapping("/id/{id}")
    public Vehicle getId(@PathVariable("id") final Integer id) {
        return vehicleRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public Vehicle update(@PathVariable("id") final Integer id, @PathVariable("name")
                         final String name) {


    	Vehicle vehicle = getId(id);
    	vehicle.setName(name);

        return vehicleRepository.save(vehicle);
    }
    
    @PostMapping("/saveVehicle")
    public Vehicle save(@RequestBody Vehicle vehicle) {
    	   Date now = new Date();
    	   vehicle.setCreatedDate(now);
        return vehicleRepository.save(vehicle);
    }
}
