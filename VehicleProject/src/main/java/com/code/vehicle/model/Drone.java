package com.code.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Drone extends Vehicle{

	@Column(name="max_range")
	int maxRange;

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	
}
