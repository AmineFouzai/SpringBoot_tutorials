package com.example.demo.Services;
import java.util.List;
import com.example.demo.Entites.Vehicle;

public interface VehicleService {
Vehicle addVehicle(Vehicle v);
Vehicle updateVehicle(Vehicle v);
void deleteVehicle(Vehicle v);
void deleteVehicleById(Long id);
List <Vehicle> getAllVehicles();


}
