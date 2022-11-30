package com.aqms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restdbtable")
public class AirData {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="floor")
	private String floor;
	
	@Column(name="name_of_the_gas")
	private String nameOfTheGas;
	
	@Column(name="concentration_level")
	private float concentrationLevel;
	
	
	
	public AirData() {
		
	}

	
	public AirData(int id, String floor, String nameOfTheGas, float concentrationLevel) {
		this.id = id;
		this.floor = floor;
		this.nameOfTheGas = nameOfTheGas;
		this.concentrationLevel = concentrationLevel;
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getNameOfTheGas() {
		return nameOfTheGas;
	}

	public void setNameOfTheGas(String nameOfTheGas) {
		this.nameOfTheGas = nameOfTheGas;
	}

	public float getConcentrationLevel() {
		return concentrationLevel;
	}

	public void setConcentrationLevel(float concentrationLevel) {
		this.concentrationLevel = concentrationLevel;
	}



}
