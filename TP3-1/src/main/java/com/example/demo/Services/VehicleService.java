package com.example.demo.Services;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.Entites.Vehicle;

@Service
public interface VehicleService {
Vehicle addVehicle(Vehicle v);
Vehicle updateVehicle(Vehicle v);
void deleteVehicle(Vehicle v);
void deleteVehicleById(Long id);
Vehicle getVehicle(Long id);
List <Vehicle> getAllVehicles();
Page<Vehicle> getAllVehiclesbyPage(int page,int size);

}
