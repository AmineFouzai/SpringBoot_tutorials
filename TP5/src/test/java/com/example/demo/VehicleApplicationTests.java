package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.Entites.Vehicle;
import com.example.demo.Entites.Warehouse;
import com.example.demo.Repositorys.VehicleRepository;
@SpringBootTest
class VehicleApplicationTests {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Test
	public void testVehicleCreation() {
		Vehicle v= new Vehicle("car","bmw",new Date(),10000.0);
		vehicleRepository.save(v);
	}

	@Test
	public  void testVehicleLookUp(){
		Vehicle v= vehicleRepository.findById(1L).get();
		System.out.println(v);

	}
	@Test
	public void testVehicleDelete(){
		vehicleRepository.deleteById(1L);
	}
	@Test
	public void testVehicleUpdate(){
		Vehicle v= vehicleRepository.findById(1L).get();
		v.setVehiclePrice(500.0);
		vehicleRepository.save(v);
	}
	@Test
	public void testVehicleLookUps(){
		List<Vehicle> vehicles=vehicleRepository.findAll();
		for(Vehicle v :vehicles){
			System.out.println(v);
		}

	}
	@Test 
	public void testFindVehicleByPage() {
		Page<Vehicle> vehicles=vehicleRepository.findAll(PageRequest.of(0,2));
		System.out.println(vehicles.getSize());
		System.out.println(vehicles.getTotalElements());
		System.out.println(vehicles.getTotalPages());
		vehicles.getContent().forEach(vehicle ->{
		System.out.println(vehicle.toString());
		});
		
	}

	@Test
	public void testFindByVehicleModel() {
		List<Vehicle> vehicles=vehicleRepository.findByVehicleModel("bmw");
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
	}
	
	@Test
	public void testFindByVehicleModelContains() {
		List<Vehicle> vehicles=vehicleRepository.findByVehicleModel("bmw");
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
	}
	
	
	@Test
	public void testFindByVehiclePrice() {
		List<Vehicle> vehicles=vehicleRepository.findByVehiclPrice("benz",200.0);
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
		
	}
	
	
	@Test
	public void testFindByWarehouse() {
		
		Warehouse warehouse = new Warehouse();
		warehouse.setWarehouseId(1L);
		
		List<Vehicle> vehicles=vehicleRepository.findByWarehouse(warehouse);
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
		
	}
	
	
	
	@Test
	public void findByVehicleOrderdModelASC() {
		
		
		List<Vehicle> vehicles=vehicleRepository.findByVehicleOrderdModelASC();
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
		
	}
	
	
	@Test
	public void findByVehicleOrderdModelAndPrice() {
		
		
		List<Vehicle> vehicles=vehicleRepository.findByVehicleOrderdModelAndPrice();
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
		
		
	}
	
	
	
}

