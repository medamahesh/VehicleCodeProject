package com.code.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle{

	@Column(name="max_capacity")
	private int maxCpacity;

	public int getMaxCpacity() {
		return maxCpacity;
	}

	public void setMaxCpacity(int maxCpacity) {
		this.maxCpacity = maxCpacity;
	}
	
	
}
