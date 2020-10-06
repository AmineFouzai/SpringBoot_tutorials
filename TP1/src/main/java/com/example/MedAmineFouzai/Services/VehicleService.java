package com.example.MedAmineFouzai.Services;
import java.util.List;
import com.example.MedAmineFouzai.Entites.Vehicle;

public interface VehicleService {
Vehicle addVehicle(Vehicle v);
Vehicle updateVehicle(Vehicle v);
void deleteVehicle(Vehicle v);
void deleteVehicleById(Long id);
List <Vehicle> getAllVehicles();


}
