package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Entites.Vehicle;
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
}

