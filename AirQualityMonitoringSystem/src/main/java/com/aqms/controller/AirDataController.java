package com.aqms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aqms.model.AirData;
import com.aqms.service.AirDataService;

@RestController
public class AirDataController {
	
	@Autowired
	private AirDataService airDataService;
	
	@GetMapping("/all")
	public List<AirData> getAll() {
		return airDataService.getAll();
	}
	
	@GetMapping("/all/{id}")
	public AirData getOneGasData(@PathVariable int id){
		return airDataService.getOneGasData(id);
	}
	
	@PostMapping("/all")
	public void addGasData(@RequestBody AirData airData) {
		airDataService.addGasData(airData);
	}
	
	@PutMapping("/all/{id}")
	public void updateGasData( @RequestBody AirData airData,@PathVariable int id) {
		airDataService.updateGasData(id, airData);
	}
	
	@DeleteMapping("/all/{id}")
	public void deleteGasData(@PathVariable int id) {
		airDataService.deleteGasData(id);
	}
}








