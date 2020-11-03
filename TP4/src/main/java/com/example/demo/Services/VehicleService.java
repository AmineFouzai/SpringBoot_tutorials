package com.example.demo.Services;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.Entites.Vehicle;
import com.example.demo.Entites.Warehouse;

@Service
public interface VehicleService {
Vehicle addVehicle(Vehicle v);

Vehicle updateVehicle(Vehicle v);

void deleteVehicle(Vehicle v);

void deleteVehicleById(Long id);

Vehicle getVehicle(Long id);

List <Vehicle> getAllVehicles();

Page<Vehicle> getAllVehiclesbyPage(int page,int size);

List<Vehicle> findByVehicleModel(String model);

List<Vehicle> findByVehicleModelContains(String model);

List<Vehicle> findByVehiclPrice(String model,  Double price );

List<Vehicle> findByWarehouse( Warehouse warehouse);

List<Vehicle> findByWarehouseId(  Long id);

List<Vehicle> findByVehicleOrderdModelASC();

List<Vehicle> findByVehicleOrderdModelAndPrice();

}
