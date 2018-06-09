package com.code.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Boat extends Vehicle {
	
	@Column(name = "max_weight")
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

}
