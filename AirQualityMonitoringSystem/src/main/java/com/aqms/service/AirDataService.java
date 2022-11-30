package com.aqms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aqms.model.AirData;
import com.aqms.repository.AirDataRepository;


@Service
public class AirDataService {
	
	@Autowired
	private AirDataRepository airDataRepository;

	public List<AirData> getAll() {
		return (List<AirData>) airDataRepository.findAll();
	}
	
	public AirData getOneGasData(int id) {
		return airDataRepository.findById(id).orElse(null);
	}
	
	public void addGasData(AirData airData) {
		airDataRepository.save(airData);
	}
	
	public void updateGasData(int id, AirData airData) {
		airDataRepository.save(airData);
	}
	
	public void deleteGasData(int id) {
		airDataRepository.deleteById(id);;
	}
	

}
