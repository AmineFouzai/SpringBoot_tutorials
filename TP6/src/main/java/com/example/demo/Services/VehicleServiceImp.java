package com.example.demo.Services;
import com.example.demo.Entites.Vehicle;
import com.example.demo.Entites.Warehouse;
import com.example.demo.Repositorys.VehicleRepository;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import  java.util.List;

@Service
public class VehicleServiceImp implements VehicleService  {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle v) {
        return vehicleRepository.save(v);
    }
    

    @Override
    public Vehicle updateVehicle(Vehicle v) {
        return vehicleRepository.save(v);
    }

    @Override
    public void deleteVehicle(Vehicle v) {
        vehicleRepository.delete(v);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

	@Override
	public Vehicle getVehicle(Long id) {
		return vehicleRepository.findById(id).get();
	}

	@Override 
	public Page<Vehicle> getAllVehiclesbyPage(int page,int size){
		return vehicleRepository.findAll(PageRequest.of(page, size));
	}


	@Override
	public List<Vehicle> findByVehicleModel(String model) {
	
		return vehicleRepository.findByVehicleModel(model);
	}


	@Override
	public List<Vehicle> findByVehicleModelContains(String model) {

		return vehicleRepository.findByVehicleModelContains(model);
	}


	@Override
	public List<Vehicle> findByVehiclPrice(String model, Double price) {

		return vehicleRepository.findByVehiclPrice(model, price);
	}


	@Override
	public List<Vehicle> findByWarehouse(Warehouse warehouse) {

		return vehicleRepository.findByWarehouse(warehouse);
	}


	@Override
	public List<Vehicle> findByWarehouseId(Long id) {

		return vehicleRepository.findByWarehouseId(id);
	}


	@Override
	public List<Vehicle> findByVehicleOrderdModelASC() {
	
		return vehicleRepository.findByVehicleOrderdModelASC();
	}


	@Override
	public List<Vehicle> findByVehicleOrderdModelAndPrice() {
	
		return vehicleRepository.findByVehicleOrderdModelAndPrice();
	}




}