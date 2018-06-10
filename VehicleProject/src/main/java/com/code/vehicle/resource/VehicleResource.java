package com.code.vehicle.resource;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.vehicle.model.Boat;
import com.code.vehicle.model.Car;
import com.code.vehicle.model.Drone;
import com.code.vehicle.model.Truck;
import com.code.vehicle.model.Vehicle;
import com.code.vehicle.repository.BoatRepository;
import com.code.vehicle.repository.CarRepository;
import com.code.vehicle.repository.DroneRepository;
import com.code.vehicle.repository.TruckRepository;
import com.code.vehicle.repository.VehicleRepository;

@RestController
@RequestMapping("/rest/vehicle")
public class VehicleResource {

    
    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    CarRepository carRepository;
    @Autowired
    TruckRepository truckRepository;
    @Autowired
    DroneRepository droneRepository;
    @Autowired
    BoatRepository boatRepository;

    Date now = new Date();
    @GetMapping("/allVehicles")
    public Iterable<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }

    @PostMapping("/saveCar")
    public Car saveCar(@RequestBody Car car) {
    	   car.setCreatedDate(now);
    		   return carRepository.save(car);
    	   
    }
    @PostMapping("/saveTruck")
    public Truck saveTruck(@RequestBody Truck truck) {
    	  
    	   truck.setCreatedDate(now);
    		   return truckRepository.save(truck);
    	   
    }
    @PostMapping("/saveBoat")
    public Boat saveBoat(@RequestBody Boat boat) {
    	   Date now = new Date();
    	   boat.setCreatedDate(now);
    		   return boatRepository.save(boat);
    	   
    }
    @PostMapping("/saveDrone")
    public Drone saveDrone(@RequestBody Drone drone) {
    	   Date now = new Date();
    	   drone.setCreatedDate(now);
    		   return droneRepository.save(drone);
    	   
    }
    
    @GetMapping("/update/{id}/{name}")
    public Vehicle update(@PathVariable("id") final Integer id, @PathVariable("name")
                         final String name) {


    	Vehicle vehicle = getId(id);
    	vehicle.setName(name);

        return vehicleRepository.save(vehicle);
    }
    
    @DeleteMapping("/deleteVehicle")
    public String delete(){
    	vehicleRepository.deleteVehicle();
    	return "Vehicles Deleted";
    }
    

    @GetMapping("/id/{id}")
    public Vehicle getId(@PathVariable("id") final Integer id) {
        return vehicleRepository.findOne(id);
    }
   
}
