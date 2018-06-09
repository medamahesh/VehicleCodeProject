package com.code.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*@Table(name = "Car", catalog= "test")*/
public class Car extends Vehicle{


	@Column(name = "max_speed")
	private int maxSpeed;
	 
	 
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	

}
