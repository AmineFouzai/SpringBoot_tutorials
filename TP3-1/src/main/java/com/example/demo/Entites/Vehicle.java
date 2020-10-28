package com.example.demo.Entites;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    private String vehicleType;
    private String vehicleModel;
    private Date vehicleCreationDate;
    private Double vehiclePrice;
    public  Vehicle(){
        super();
    }
    public Vehicle(String vehicleType, String vehicleModel, Date vehicleCreationDate, Double vehiclePrice) {
        
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.vehicleCreationDate = vehicleCreationDate;
        this.vehiclePrice = vehiclePrice;
    }
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Date getVehicleCreationDate() {
        return vehicleCreationDate;
    }

    public void setVehicleCreationDate(Date vehicleCreationDate) {
        this.vehicleCreationDate = vehicleCreationDate;
    }

    public Double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(Double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }




    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleCreationDate=" + vehicleCreationDate +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }
}

