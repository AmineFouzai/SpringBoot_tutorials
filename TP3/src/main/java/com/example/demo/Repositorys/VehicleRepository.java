package com.example.demo.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entites.Vehicle;

public interface VehicleRepository extends  JpaRepository<Vehicle,Long>{

}