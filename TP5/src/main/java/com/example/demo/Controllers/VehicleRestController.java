package com.example.demo.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entites.Vehicle;
import com.example.demo.Services.VehicleService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class VehicleRestController {
		
	@Autowired
	VehicleService vehicleservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Vehicle> getAllVehicles() {
			return vehicleservice.getAllVehicles();
	}
	
	@RequestMapping(value="/vehicle/{id}",method = RequestMethod.GET)
	public Vehicle getVehicleById(@PathVariable("id") Long id) {
	return vehicleservice.getVehicle(id);

	}
	
	
	@RequestMapping(value="/vehicle/create",method = RequestMethod.POST)
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
	return vehicleservice.addVehicle(vehicle);
	
	}
	
	@RequestMapping(value="/vehicle/update",method = RequestMethod.PUT)
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		return vehicleservice.updateVehicle(vehicle);
	}
	
	@RequestMapping(value="/vehicle/delete/{id}",method = RequestMethod.DELETE)
	public List<Vehicle> deleteVehicle(@PathVariable("id") Long id)
	{
		vehicleservice.deleteVehicleById(id);
		return this.getAllVehicles();
		
	}
	
	@RequestMapping(value="/warehouse/{idCat}",method = RequestMethod.GET)
	public List<Vehicle> getVehiclesByCatId(@PathVariable("idCat") Long idCat) {
	return vehicleservice.findByWarehouseId(idCat);
	}
	
	
	
}

