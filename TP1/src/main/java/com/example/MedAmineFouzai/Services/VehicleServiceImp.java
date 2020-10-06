package com.example.MedAmineFouzai.Services;
import com.example.MedAmineFouzai.Entites.Vehicle;
import com.example.MedAmineFouzai.Repositorys.VehicleRepository;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import  java.util.List;

@SpringBootTest
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





}
