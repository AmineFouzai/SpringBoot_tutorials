package com.example.demo.Repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entites.Vehicle;
import com.example.demo.Entites.Warehouse;

public interface VehicleRepository extends  JpaRepository<Vehicle,Long>{

	List<Vehicle> findByVehicleModel(String model);//DONT WORK need to be manuly implanted
	List<Vehicle> findByVehicleModelContains(String model);//DONT WORK  both
	
	@Query("select v from Vehicle v where v.vehicleModel like %:model and v.vehiclePrice > :price ")
	List<Vehicle> findByVehiclPrice(@Param("model") String model, @Param("price") Double price );
	
	@Query("select v from Vehicle v where v.warehouse =?1 ")
	List<Vehicle> findByWarehouse( Warehouse warehouse);
	
	@Query("select v from Vehicle v where v.warehouse.WarehouseId =:id")
	List<Vehicle> findByWarehouseId( @Param("id") Long id);
	
	@Query("select v from Vehicle v order by v.vehicleModel ASC")
	List<Vehicle> findByVehicleOrderdModelASC();
	
	@Query("select v from Vehicle v order by v.vehicleModel ASC,v.vehiclePrice DESC")
	List<Vehicle> findByVehicleOrderdModelAndPrice();
	
	
	
	
	
}