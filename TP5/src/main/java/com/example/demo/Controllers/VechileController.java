package com.example.demo.Controllers;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Entites.Vehicle;
import com.example.demo.Services.VehicleService;

@Controller
public class VechileController {
	
	
	@Autowired
	VehicleService vehicleService;
	
	
	@RequestMapping(value="/createVehicle",
					method=RequestMethod.GET)
	public String showCreate()
	{
		return "createVehicle";
	}
	
	@RequestMapping(value="/saveVehicle",
					method=RequestMethod.POST)
	public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle, 
							  @RequestParam("date") @DateTimeFormat(pattern= "yyyy-MM-dd") Date date,
							  ModelMap modelMap) throws ParseException 
	{
		
        
		 vehicle.setVehicleCreationDate(date);
         Vehicle savedVehicle = vehicleService.addVehicle(vehicle);
		 modelMap.addAttribute("msg", "vehicle successfully saved  with ID ["+savedVehicle.getVehicleId()+"]");
		return showCreate();
	}
	
	@RequestMapping(value="/listeVehicles",
					method=RequestMethod.GET)
	public String listeVehicles(ModelMap modelMap,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="2") int size)
	{
		Page<Vehicle> vehicles = vehicleService.getAllVehiclesbyPage(page, size);
		modelMap.addAttribute("vehicles", vehicles);		
		modelMap.addAttribute("pages",new int[vehicles.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		return "listeVehicles";	
	}
	
@RequestMapping(value="/deleteVehicle",
				method=RequestMethod.GET)
	public String supprimerArbre(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleId(id);
		vehicleService.deleteVehicle(vehicle);
		return listeVehicles(modelMap, 0, 2);
	}

	@RequestMapping("/changeVehicle")
	public String editerArbre(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Vehicle vehicle= vehicleService.getVehicle(id);
		modelMap.addAttribute("vehicle", vehicle);	
 		return "editVehicle";	
 	}
	

	@RequestMapping("/updateVehicle")
	public String updateArbre(@ModelAttribute("vehicle") Vehicle vehicle,
							  @RequestParam("date")  @DateTimeFormat(pattern= "yyyy-MM-dd")  Date date,
			                  ModelMap modelMap) throws ParseException 
	{
		
		 vehicle.setVehicleCreationDate(date);
         vehicleService.updateVehicle(vehicle);
         List<Vehicle> vehicles = vehicleService.getAllVehicles();
		 modelMap.addAttribute("vehicles", vehicles);	
		 return listeVehicles(modelMap,0,2);
	}

}
