package com.example.demo.Entites;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long WarehouseId;
    private String WarehouseName;
    private String WarehouseDescription;
    
    @JsonIgnore
    @OneToMany(mappedBy="warehouse")
    private List<Vehicle> vehicles;
    

	public  Warehouse(){
        super();
    }
    public Warehouse(String WarehouseName, String WarehouseDescription, List<Vehicle> vehicles) {
        this.setWarehouseName(WarehouseName);
        this.setWarehouseDescription(WarehouseDescription);
        this.vehicles=vehicles;
   
      
    }
    
    public List<Vehicle> getVehicles() {
		return vehicles;
	}
    
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public Long getWarehouseId() {
		return WarehouseId;
	}
	
	public void setWarehouseId(Long warehouseId) {
		WarehouseId = warehouseId;
	}
	
	public String getWarehouseDescription() {
		return WarehouseDescription;
	}
	
	public void setWarehouseDescription(String warehouseDescription) {
		WarehouseDescription = warehouseDescription;
	}
	
	public String getWarehouseName() {
		return WarehouseName;
	}
	
	public void setWarehouseName(String warehouseName) {
		WarehouseName = warehouseName;
	}

}
